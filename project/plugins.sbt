// resolvers

resolvers += "sbt-plugin-releases" at "http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// plugins

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.6")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.4.0")
