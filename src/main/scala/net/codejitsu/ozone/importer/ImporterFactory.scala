package net.codejitsu.ozone.importer

import scala.util.Try

object ImporterFactory {
  object ImporterTypes {
    val Json = "json"
  }

  private def createJsonImporter(): Importer = new JsonImporter()

  def create(importerType: String): Try[Importer] = importerType match {
    case ImporterTypes.Json => Try(createJsonImporter())
  }
}
