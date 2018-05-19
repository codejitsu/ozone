package net.codejitsu.ozone.parser

import scala.io.Source
import scala.util.Try
import org.json4s._
import org.json4s.jackson.JsonMethods._

class DataParser(val fileName: String) {

  def parseColumn(columnData: List[JValue]): Seq[ColumnInfo] = {
    for {
      columnPart <- columnData
      JInt(id) <- columnPart \ "id"
      JString(name) <- columnPart \ "name"
      JString(dataTypeName) <- columnPart \ "dataTypeName"
      JString(fieldName) <- columnPart \ "fieldName"
      JInt(position) <- columnPart \ "position"
      JString(renderTypeName) <- columnPart \ "renderTypeName"
    } yield {
      ColumnInfo(id.toInt, name, dataTypeName, fieldName, position.toInt, renderTypeName)
    }
  }

  def parseRows(rowsData: List[JValue]): Seq[Row] = {
    for {
      JArray(rowPart) <- rowsData
      JInt(sid) = rowPart(0)
      JString(id) = rowPart(1)
      JInt(position) = rowPart(2)
      JInt(created_at) = rowPart(3)
      JString(created_meta) = rowPart(4)
      JInt(updated_at) = rowPart(5)
      JString(updated_meta) = rowPart(6)
      meta = rowPart(7) match {
        case JString(m) => m
        case _ => "-"
      }
      JString(measureid) = rowPart(8)
      JString(measurename) = rowPart(9)
      JString(measuretype) = rowPart(10)
      JString(stratificationlevel) = rowPart(11)
      JString(statefips) = rowPart(12)
      JString(statename) = rowPart(13)
      JString(countyfips) = rowPart(14)
      JString(countyname) = rowPart(15)
      JString(reportyear) = rowPart(16)
      JString(value) = rowPart(17)
      JString(unit) = rowPart(18)
      JString(unitname) = rowPart(19)
      JString(dataorigin) = rowPart(20)
      JString(monitoronly) = rowPart(21)
    } yield {
      Row(sid.toInt, id, position.toInt, created_at.toInt, created_meta, updated_at.toInt, updated_meta,
        meta, measureid, measurename, measuretype, stratificationlevel, statefips, statename, countyfips,
        countyname, reportyear, value, unit, unitname, dataorigin, monitoronly)
    }
  }

  def toParsed(parsed: JValue): ParsedFile = {
    val metaDataColumns = parsed \ "meta" \ "view" \ "columns"

    val columns: Seq[Seq[ColumnInfo]] = for {
      JArray(colList) <- metaDataColumns
    } yield {
      parseColumn(colList)
    }

    val rowsJson = parsed \ "data"

    val rows: Seq[Row] = parseRows(rowsJson.children)

    ParsedFile(columns.flatten, rows)
  }

  def parseData(): Try[ParsedFile] = Try {
    val fileContent = Source.fromFile(fileName)

    val parsed = parse(fileContent.mkString)

    toParsed(parsed)
  }
}
