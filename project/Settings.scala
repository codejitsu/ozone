// Copyright (C) 2018, codejitsu.

import sbt._
import sbt.Keys._

import scala.language.postfixOps
import sbtassembly.AssemblyPlugin.autoImport._
import sbtdocker._
import DockerKeys._
import sbt.Package.ManifestAttributes

object Settings extends Build {
  lazy val buildSettings = Seq(
    name                  := "ozone",
    normalizedName        := "ozone",
    organization          := "codejitsu",
    organizationHomepage  := Some(url("http://www.codejitsu.net")),
    scalaVersion          := Versions.ScalaVer,
    homepage              := Some(url("http://www.github.com/codejitsu/ozone"))
  )

  override lazy val settings = super.settings ++ buildSettings

  val parentSettings = buildSettings ++ Seq(
    publishArtifact := false,
    publish         := {}
  )

  val scalacSettings = Seq("-encoding", "UTF-8", s"-target:jvm-${Versions.JDKVer}", "-feature", "-language:_",
    "-deprecation", "-unchecked", "-Xfatal-warnings", "-Xlint")

  val javacSettings = Seq("-encoding", "UTF-8", "-source", Versions.JDKVer,
    "-target", Versions.JDKVer, "-Xlint:deprecation", "-Xlint:unchecked")

  lazy val defaultSettings = Defaults.coreDefaultSettings ++ Seq(
    autoCompilerPlugins := true,
    scalacOptions       ++= scalacSettings,
    javacOptions        in Compile    ++= javacSettings,
    ivyLoggingLevel     in ThisBuild  := UpdateLogging.Quiet,
    parallelExecution   in ThisBuild  := false,
    parallelExecution   in Global     := false,
    ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) },
    resolvers += "Typesafe private" at "https://private-repo.typesafe.com/typesafe/maven-releases",
    resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
  )

  lazy val commonSettings = defaultSettings

  val tests = inConfig(Test)(Defaults.testTasks) ++ inConfig(IntegrationTest)(Defaults.itSettings)

  val testOptionSettings = Seq(
    Tests.Argument(TestFrameworks.ScalaTest, "-oDF"),
    Tests.Argument(TestFrameworks.JUnit, "-oDF", "-v", "-a")
  )

  lazy val ozoneCommonSettings = Seq(
    mainClass in assembly := Some("net.codejitsu.ozone.JsonImporter"),

    // Resolve duplicates for Sbt Assembly
    assemblyMergeStrategy in assembly := {
      case PathList(xs@_*) if xs.last == "io.netty.versions.properties" => MergeStrategy.rename
      case other => (assemblyMergeStrategy in assembly).value(other)
    },

    // publish to artifacts directory
    publishArtifact in(Compile, packageDoc) := false,

    publishTo := Some(Resolver.file("file", new File("artifacts"))),

    cleanFiles <+= baseDirectory { base => base / "artifacts" },

    dockerfile in docker := {
      val baseDir = baseDirectory.value
      val artifact: File = assembly.value

      val imageAppBaseDir = "/app"
      val artifactTargetPath = s"$imageAppBaseDir/${artifact.name}"
      val artifactTargetPath_ln = s"$imageAppBaseDir/${name.value}.jar"

      val dockerResourcesDir = baseDir / "docker-resources"
      val dockerResourcesTargetPath = s"$imageAppBaseDir/"

      val appConfTarget = s"$imageAppBaseDir/conf/application"
      val logConfTarget = s"$imageAppBaseDir/conf/logging"

      new Dockerfile {
        from("openjdk:8-jre")
        maintainer("codejitsu")
        //expose(80, 8080)
        env("APP_BASE", s"$imageAppBaseDir")
        env("APP_CONF", s"$appConfTarget")
        env("LOG_CONF", s"$logConfTarget")
        copy(artifact, artifactTargetPath)
        copy(dockerResourcesDir, dockerResourcesTargetPath)
        copy(baseDir / "src" / "main" / "resources" / "logback.xml", logConfTarget)
        //Symlink the service jar to a non version specific name
        run("ln", "-sf", s"$artifactTargetPath", s"$artifactTargetPath_ln")
        entryPoint(s"${dockerResourcesTargetPath}docker-entrypoint.sh")
      }
    },

    buildOptions in docker := BuildOptions(cache = false),

    imageNames in docker := Seq(
      ImageName(
        namespace = Some(organization.value),
        repository = name.value,
        // We parse the IMAGE_TAG env var which allows us to override the tag at build time
        tag = Some(sys.props.getOrElse("IMAGE_TAG", default = version.value))
      )
    )
  )
}
