name := "twitter-like"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  cats,
  catsCore,
  scalatest,
  mockito
)

lazy val auth = project in file("auth")
