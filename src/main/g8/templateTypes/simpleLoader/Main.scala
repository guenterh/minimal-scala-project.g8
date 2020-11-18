package ch.memobase.testing.mediaserver

import org.apache.logging.log4j.scala.Logging
import org.memobase.settings.SettingsLoader
import scala.jdk.CollectionConverters._

object Main extends Logging{

  val settings = new SettingsLoader(List(
    "mode",
    "zkhosts"
  ).asJava,
    "app.yml",
    false,
    false,
    false,
    false)



  def main(args: Array[String]): Unit = {

  }

}
