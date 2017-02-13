package com.github.yoshiyoshifujii.aws.serverless

import sbt._
import serverless.ServerlessOption

trait ServerlessKeys {

  lazy val deploy         = taskKey[Unit]("")

  lazy val deployFunction = inputKey[Unit]("")

  lazy val deployList     = taskKey[Unit]("")

  lazy val invoke         = taskKey[Unit]("")

  lazy val logs           = taskKey[Unit]("")

  lazy val info           = taskKey[Unit]("")

  lazy val remove         = taskKey[Unit]("")

  lazy val serverlessOption = taskKey[ServerlessOption]("")
}

object ServerlessKeys extends ServerlessKeys

