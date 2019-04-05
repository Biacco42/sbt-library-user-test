
scalaVersion := "2.12.8"

organization := "info.biacco42.app"

lazy val testApp = (project in file("."))
    .settings(
      name := "sbt-library-user-test",
      version := "0.1.0",
      resolvers += "TestLib" at "https://biacco42.github.io/sbt-library-test/product/",
      libraryDependencies += "info.biacco42.lib" %% "sbt-library-test" % "0.1.0"
    )


