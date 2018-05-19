// Copyright (C) 2018, codejitsu.

import sbt._
import sbt.Keys._
import sbtdocker.DockerPlugin

object ProjectBuild extends Build {
  import Settings._

  lazy val root = Project(
    id = "ozone",
    base = file("."),
    settings = parentSettings ++ commonSettings ++ ozoneCommonSettings ++ Seq(libraryDependencies ++= Dependencies.common)
  ).enablePlugins(DockerPlugin)
}

object Dependencies {
  import Versions._

  object CompileDeps {
    val config        = "com.typesafe"                    % "config"                   % TypesafeConfigVer
    val logback       = "ch.qos.logback"                  % "logback-classic"          % LogbackVer
    val logging       = "com.typesafe.scala-logging"     %% "scala-logging"            % TypesafeLoggingVer
    val joda          = "joda-time"                       % "joda-time"                % JodaTimeVer
    val jodaConvert   = "org.joda"                        % "joda-convert"             % JodaTimeConvertVer
    val jackson       = "org.json4s"                     %% "json4s-jackson"           % Jackson4sVer
    val mysql         = "mysql"                           % "mysql-connector-java"     % MySqlConnectorVer
  }

  object TestDeps {
    val scalatest     = "org.scalatest"           %% "scalatest"                % ScalaTestVer      % Test
    val junit         = "junit"                    % "junit"                    % JunitVer          % Test
  }

  import CompileDeps._

  val test = Seq(TestDeps.scalatest)
  val testJunit = Seq(TestDeps.junit)

  /** Module deps */

  val common = Seq(config, joda, jodaConvert, logging, logback, jackson, mysql) ++ test
}
