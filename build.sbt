name := """panda3shoes"""
organization := "pl.edu.pwr.ebct.bbk"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += jdbc

libraryDependencies += "org.webjars" % "bootstrap" % "4.1.1"
libraryDependencies += "org.webjars" % "font-awesome" % "5.0.13"
libraryDependencies += "org.webjars" % "jquery" % "3.3.1-1"

libraryDependencies += "org.postgresql" % "postgresql" % "42.2.2"
libraryDependencies += javaForms
