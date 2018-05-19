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
      JInt(tableColumnId) <- columnPart \ "tableColumnId"
      JInt(width) <- columnPart \ "width"
    } yield {
      ColumnInfo(id.toInt, name, dataTypeName, fieldName, position.toInt, renderTypeName,
        tableColumnId.toInt, width.toInt)
    }
  }

  def toParsed(parsed: JValue): ParsedFile = {
    val metaDataColumns = parsed \ "meta" \ "view" \ "columns"

    val columns: Seq[Seq[ColumnInfo]] = for {
      JArray(colList) <- metaDataColumns
    } yield {
      parseColumn(colList)
    }

    ParsedFile(columns.flatten)
  }

  def parseData(): Try[ParsedFile] = Try {
    val fileContent = Source.fromFile(fileName)

    val parsed = parse(fileContent.mkString)

    toParsed(parsed)
  }
}
