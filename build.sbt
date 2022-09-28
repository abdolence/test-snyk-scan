name := "test-snyk-scan"
organization := "org.example"

val appScalaVersion = "2.13.8"
val apiScalaVersions = Seq(appScalaVersion)

ThisBuild / scalaVersion := appScalaVersion

val akkaVersion = "2.6.20"
val akkaHttpVersion = "10.2.10"

libraryDependencies ++= Seq(
  "commons-net" % "commons-net" % "3.7.2",
  "com.mixpanel" % "mixpanel-java" % "1.5.1",
  "org.scalamock" %% "scalamock" % "5.2.0" % Test,
  "org.scalatest" %% "scalatest" % "3.2.13" % Test,
  "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0" % Test,
  "com.github.etaty" %% "rediscala" % "1.9.0",
  "org.jsoup" % "jsoup" % "1.14.2",
  "com.softwaremill.macwire" %% "util" % "2.3.5",
  "com.softwaremill.macwire" %% "macros" % "2.3.5" % "provided",
  "com.softwaremill.macwire" %% "macrosakka" % "2.3.5" % "provided",
  "com.softwaremill.common" %% "tagging" % "2.2.1",
  "com.github.etaty" %% "rediscala" % "1.9.0",
  "org.apache.santuario" % "xmlsec" % "2.2.3", // Vulnerable dep!
  "org.apache.commons" % "commons-text" % "1.9",
)

publish := {}
publishLocal := {}
// Disable generating documentation

ThisBuild / packageDoc / publishArtifact := false
ThisBuild / publishMavenStyle := true

