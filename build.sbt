name := "twitter-like"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  cats,
  catsCore,
  scalatest,
  mockito
)

lazy val authCore = project in file("auth/core")
lazy val authApi = project in file("auth/api")
