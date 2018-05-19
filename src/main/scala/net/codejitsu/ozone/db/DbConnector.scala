package net.codejitsu.ozone.db

import java.sql.DriverManager

import net.codejitsu.ozone.parser.ColumnInfo

import scala.util.Try

class DbConnector {
  def createTable(columns: Seq[ColumnInfo], url: String, user: String, pwd: String): Try[Boolean] = Try {
    try {
      Class.forName("com.mysql.jdbc.Driver")
      val conn = DriverManager.getConnection(url, user, pwd)

      val stmt = conn.createStatement()

      val sql =
        """
          |CREATE TABLE REGISTRATION
          |(id INTEGER not NULL,
          | first VARCHAR(255),
          | last VARCHAR(255),
          | age INTEGER,
          | PRIMARY KEY ( id ))
        """.stripMargin

      stmt.executeUpdate(sql)
    } catch {
      case th: Throwable => th.printStackTrace()
    }

    true
  }
}
