package net.codejitsu.ozone.importer

import net.codejitsu.ozone.parser.Row

import scala.util.Try

trait Importer {
  def importData(rows: Seq[Row], dbUrl: String, dbUser: String, dbPassword: String, chunkSize: Int): Try[Boolean]
}
