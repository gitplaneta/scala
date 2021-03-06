import sbt._
import Process._
import Keys._

name := "scala-note"

version := "1.0"

scalaVersion := "2.11.6"

val scalazVersion = "7.1.1"

val dispatchVersion = "0.11.2"


libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "org.scalaz" %% "scalaz-effect" % scalazVersion,
  "org.scalaz" %% "scalaz-concurrent" % scalazVersion,
  "org.scalaz" %% "scalaz-iteratee" % scalazVersion,
  "com.typesafe.slick" % "slick_2.10" % "2.1.0",
  "net.databinder.dispatch" %% "dispatch-core" % dispatchVersion,
  "net.databinder.dispatch" %% "dispatch-json4s-jackson" % dispatchVersion,
  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9",
  "com.typesafe.akka" % "akka-testkit_2.11" % "2.3.9",
  "io.reactivex" % "rxscala_2.11" % "0.24.1",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "junit" % "junit" % "4.12"

)

testOptions in Test += Tests.Argument("-oI")
