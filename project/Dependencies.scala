import sbt._
import Keys._

object Dependencies
  extends Build
    with Cats
    with TestDependencies {
}

trait TestDependencies {
  def scalatest = "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  def mockito = "org.mockito" % "mockito-core" % "1.8.5" % "test"
}

trait Cats { self =>
  final def catsVersion = "0.8.0"
  def cats = "org.typelevel" %% "cats" % self.catsVersion
  def catsCore = "org.typelevel" %% "cats-core" % self.catsVersion
}
