package net.codejitsu.ozone.importer
import java.sql.DriverManager

import com.typesafe.scalalogging.LazyLogging
import net.codejitsu.ozone.parser.Row

import scala.util.Try

class JsonImporter extends Importer with LazyLogging {

  def createInsert(chunk: Seq[Row]): String = {
    chunk.map { row =>
      s"""(${row.sid}, '${row.id.replace("'", "''")}', '${row.position}', '${row.created_at}',
         |'${row.created_meta}', '${row.updated_at}', '${row.updated_meta}',
         |'${row.meta.replace("'", "''")}', ${row.measureid}, '${row.measurename.replace("'", "''")}', '${row.measuretype.replace("'", "''")}',
         |'${row.stratificationlevel.replace("'", "''")}', '${row.statefips.replace("'", "''")}', '${row.statename.replace("'", "''")}', '${row.countyfips.replace("'", "''")}',
         |'${row.countyname.replace("'", "''")}', '${row.reportyear}', ${Try(row.value.toDouble).getOrElse(-1)}, '${row.unit.replace("'", "''")}', '${row.unitname.replace("'", "''")}',
         |'${row.dataorigin.replace("'", "''")}', ${Try(row.monitoronly.toInt).getOrElse(-1)})
         |""".stripMargin
    } mkString(",")
  }

  override def importData(rows: Seq[Row], url: String, user: String, pwd: String, chunkSize: Int): Try[Boolean] = Try {
    try {
      Class.forName("com.mysql.jdbc.Driver")
      val conn = DriverManager.getConnection(url, user, pwd)

      val stmt = conn.createStatement()

      val chunks = rows.sliding(chunkSize, chunkSize).toList

      chunks.foreach { chunk =>
        val sql = createInsert(chunk)
        val count = stmt.executeUpdate(s"INSERT INTO ozone_data VALUES $sql")

        logger.info(s"Inserted $count records.")
      }
    } catch {
      case th: Throwable => th.printStackTrace()
    }

    true
  }
}
