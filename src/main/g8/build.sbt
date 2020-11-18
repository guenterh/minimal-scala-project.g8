import Dependencies._


ThisBuild / scalaVersion := "2.13.3"

ThisBuild / organization := "ch.swisscollections"
ThisBuild / organizationName := "swisscollections"
ThisBuild / git.gitTagToVersionNumber := { tag: String =>
  if (tag matches "[0-9]+\\\\..*") {
    Some(tag)
  }
  else {
    None
  }
}




/* D. Westheide part - perhaps useful
// Monix Minitest:
libraryDependencies += "io.monix" %% "minitest" % "2.8.2" % "test"
testFrameworks += new TestFramework("minitest.runner.Framework")

// Hedgehog:
val hedgehogVersion = "0.4.2"
libraryDependencies ++= Seq(
  "qa.hedgehog" %% "hedgehog-core" % hedgehogVersion,
  "qa.hedgehog" %% "hedgehog-runner" % hedgehogVersion,
  "qa.hedgehog" %% "hedgehog-minitest" % hedgehogVersion
)

 */



lazy val root = (project in file("."))
  .enablePlugins(GitVersioning)
  .settings(
    name := "TODO New Name",
    assemblyJarName in assembly := "app.jar",
    test in assembly := {},
    assemblyMergeStrategy in assembly := {
      case "log4j.properties" => MergeStrategy.first
      case "log4j2.xml" => MergeStrategy.first
      case "module-info.class" => MergeStrategy.discard
      //https://stackoverflow.com/questions/54625572/sbt-assembly-errordeduplicate-different-file-contents-found-in-io-netty-versio
      //todo: study the mechanisms!
      case "META-INF/io.netty.versions.properties" => MergeStrategy.concat
      case x =>
        val oldStrategy = (assemblyMergeStrategy in assembly).value
        oldStrategy(x)
    },
    //mainClass in assembly := Some("ch.swisscollections.Main"),
    //resolvers ++= Seq(
    //  "Memobase Utils" at "https://dl.bintray.com/memoriav/memobase"
    //),
    libraryDependencies ++= Seq(
      log4jApi,
      log4jCore,
      log4jSlf4j,
      log4jScala,
      //memobaseServiceUtils,
      scalatic,
      scalaTest % Test
    )
  )

