package net.codejitsu.ozone

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging
import net.codejitsu.ozone.download.FileDownloader
import net.codejitsu.ozone.importer.ImporterFactory

/*
  The main entry point for the json importer.
*/
object ImporterJob extends LazyLogging {
  def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load()
    val fileUrl = config.getString("app.input.url")
    val importerType = config.getString("app.input.importer.type")

    val tempFileName = config.getString("app.input.temp-file")

    logger.info(s"Start downloading $importerType data from: '$fileUrl' to '$tempFileName'")

    for {
      jsonFile <- new FileDownloader().download(fileUrl, tempFileName)
      importer <- ImporterFactory.create(importerType)
    } yield {
      logger.info("All data stored.")
    }
  }
}
