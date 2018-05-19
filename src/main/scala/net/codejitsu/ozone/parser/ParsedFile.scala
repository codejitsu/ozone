package net.codejitsu.ozone.parser

final case class ColumnInfo(id: Int, name: String, dataTypeName: String, fieldName: String, position: Int,
                            renderTypeName: String, tableColumnId: Int, width: Int)

final case class ParsedFile(columns: Seq[ColumnInfo])
