name := """book-manager-api"""
organization := "com.techreturners"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SwaggerPlugin)

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
libraryDependencies += "org.scalatestplus" %% "mockito-3-12" % "3.2.10.0" % Test
libraryDependencies += "org.webjars" % "swagger-ui" % "4.1.2"  //play-swagger ui integration

swaggerDomainNameSpaces := Seq("models")
swaggerV3 := true
swaggerPrettyJson := true

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.techreturners.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.techreturners.binders._"
