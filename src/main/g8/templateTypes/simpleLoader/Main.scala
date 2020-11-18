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


  //logger.info("starting service with the following config settings")
  //settings.getAppSettings.forEach((key,value) => logger.info(s"key: $key  value: $value"))



  def main(args: Array[String]): Unit = {

  }

}
