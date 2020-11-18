/*
 * SOLR SearchDocs transformations
 * Copyright (C) 2020  UB Basel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

import sbt._

object Dependencies {
  lazy val log4jV = "2.12.0"
  lazy val log4jscalaV  = "12.0"
  lazy val scalatestV = "3.1.2"
  //lazy val memobaseUtilsV = "1.4.1"
  //lazy val uJsonV = "1.2.2"
  //lazy val uPickleV = "1.2.2"
  //lazy val osLibV = "0.7.1"
  //lazy val requestsV = "0.6.5"
  lazy val jwtPlayV = "4.3.0"
  lazy val joseJwtV = "8.16"



  lazy val log4jApi = "org.apache.logging.log4j" % "log4j-api" % log4jV
  lazy val log4jCore = "org.apache.logging.log4j" % "log4j-core" % log4jV
  lazy val log4jScala = "org.apache.logging.log4j" %% "log4j-api-scala" % log4jscalaV
  lazy val log4jSlf4j = "org.apache.logging.log4j" % "log4j-slf4j-impl" % log4jV
  //lazy val memobaseServiceUtils = "org.memobase" % "memobase-service-utilities" % memobaseUtilsV
  lazy val scalatic = "org.scalactic" %% "scalactic" % scalatestV
  lazy val scalaTest = "org.scalatest" %% "scalatest" % scalatestV


  //lazy val ujson = "com.lihaoyi" %% "ujson" % uJsonV
  //lazy val uPickle = "com.lihaoyi" %% "upickle" % uPickleV
  //lazy val osLib = "com.lihaoyi" %% "os-lib" % osLibV
  //lazy val requests = "com.lihaoyi" %% "requests" % requestsV
  lazy val jwtPlay = "com.pauldijou" %% "jwt-play-json" % jwtPlayV
  lazy val joseJwt = "com.nimbusds" % "nimbus-jose-jwt" % joseJwtV



}

