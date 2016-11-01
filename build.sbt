name := "twitter-like"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats" % "0.8.0",
  "org.typelevel" %% "cats-core" % "0.8.0",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.mockito" % "mockito-core" % "1.8.5" % "test"
)
