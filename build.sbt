name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.13.1"

val akkaVersion = "2.6.0"

resolvers ++= Seq(
  Resolver.sonatypeRepo("public"),
  Resolver.sonatypeRepo("releases"),
  "Confluent Maven Repo".at("https://packages.confluent.io/maven/")
)

libraryDependencies ++= Seq(
  "com.typesafe.akka"      %% "akka-actor-typed"           % akkaVersion,
  "ch.qos.logback"         % "logback-classic"             % "1.2.3",
  "org.typelevel"          %% "cats-core"                  % "2.4.2",
  "org.typelevel"          %% "cats-effect"                % "2.3.3",
  "com.typesafe.akka"      %% "akka-actor-testkit-typed"   % akkaVersion % Test,
  "org.scalatest"          %% "scalatest"                  % "3.0.8" % Test
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-unchecked",
  "-Xfatal-warnings",
  "-Yrangepos",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
)