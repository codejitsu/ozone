package net.codejitsu.ozone.parser

final case class ColumnInfo(id: Int, name: String, dataTypeName: String, fieldName: String, position: Int, renderTypeName: String)

final case class Row(sid: Int, id: String, position: Int, created_at: Int, created_meta: String,
                     updated_at: Int, updated_meta: String, meta: String, measureid: String,
                     measurename: String, measuretype: String, stratificationlevel: String,
                     statefips: String, statename: String, countyfips: String, countyname: String,
                     reportyear: String, value: String, unit: String, unitname: String,
                     dataorigin: String, monitoronly: String)

final case class ParsedFile(columns: Seq[ColumnInfo], rows: Seq[Row])
