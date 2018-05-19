package net.codejitsu.ozone

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging
import net.codejitsu.ozone.db.DbConnector
import net.codejitsu.ozone.download.FileDownloader
import net.codejitsu.ozone.importer.ImporterFactory
import net.codejitsu.ozone.parser.DataParser

/*
  The main entry point for the json importer.
*/
object ImporterJob extends LazyLogging {
  def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load()
    val fileUrl = config.getString("app.input.url")
    val importerType = config.getString("app.input.importer.type")

    val tempFileName = config.getString("app.input.temp-file")

    val dbUrl = config.getString("app.output.db.url")
    val dbUser = config.getString("app.output.db.user")
    val dbPassword = config.getString("app.output.db.password")

    val chunkSize = config.getInt("app.output.db.chunk-size")

    logger.info(s"Start downloading $importerType data from: '$fileUrl' to '$tempFileName'")

    for {
      dataFile <- new FileDownloader().download(fileUrl, tempFileName)
      //dataFile <- scala.util.Try(tempFileName)

      _ = logger.info(s"Starting parsing data file '$tempFileName'")
      parsedData <- new DataParser(tempFileName).parseData()

      _ = logger.info(s"Parsed column info: ${parsedData.columns}")
      _ = logger.info(s"${parsedData.rows.size} rows parsed")
      _ = logger.info("Creating table...")

      tableCreateSuccess <- new DbConnector().createTable(parsedData.columns, dbUrl, dbUser, dbPassword)
      _ = logger.info(s"Table successfully created: $tableCreateSuccess")

      importer <- ImporterFactory.create(importerType)
      importSuccess <- importer.importData(parsedData.rows, dbUrl, dbUser, dbPassword, chunkSize)

      _ = logger.info(s"Data successfully imported: $importSuccess")
    } yield {
      logger.info("All data stored.")
    }
  }
}
