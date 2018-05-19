package net.codejitsu.ozone.download

import java.io.File
import java.net.URL

import sys.process._
import scala.util.Try

class FileDownloader {
  def download(fileUrl: String, tempFile: String): Try[String] =
    Try(new URL(fileUrl) #> new File(tempFile) !!)
}
