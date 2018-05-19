package net.codejitsu.ozone.db

import java.sql.DriverManager

import com.typesafe.scalalogging.LazyLogging
import net.codejitsu.ozone.parser.ColumnInfo

import scala.util.Try

class DbConnector extends LazyLogging {
  def getType(name: String): String = name match {
    case "number" => "INT"
    case _ => "VARCHAR(255)"
  }

  def createTable(columns: Seq[ColumnInfo], url: String, user: String, pwd: String): Try[Boolean] = Try {
    try {
      Class.forName("com.mysql.jdbc.Driver")
      val conn = DriverManager.getConnection(url, user, pwd)

      val stmt = conn.createStatement()

      val fields = columns.map(c => s"${c.fieldName.dropWhile(ch => ch == ':')} ${getType(c.dataTypeName)}")

      val sql =
        s"""
          |CREATE TABLE ozone_data
          |(${fields.mkString(",")},
          | PRIMARY KEY ( sid ))
        """.stripMargin

      logger.info(sql)

      stmt.executeUpdate(sql)
    } catch {
      case th: Throwable => th.printStackTrace()
    }

    true
  }
}
