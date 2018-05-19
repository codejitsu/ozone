package net.codejitsu.ozone.parser

import org.scalatest.{FunSuite, Matchers}
import org.json4s._
import org.json4s.jackson.JsonMethods._

class ParserTest extends FunSuite with Matchers {
  val json =
    """
      |{
      |  "meta" : {
      |    "view" : {
      |      "id" : "cjae-szjv",
      |      "name" : "Air Quality Measures on the National Environmental Health Tracking Network",
      |      "averageRating" : 0,
      |      "createdAt" : 1439381433,
      |      "description" : "The Environmental Protection Agency (EPA) provides air pollution data about ozone and particulate matter (PM2.5) to CDC for the Tracking Network. The EPA maintains a database called the Air Quality System (AQS) which contains data from approximately 4,000 monitoring stations around the country, mainly in urban areas. Data from the AQS is considered the \"gold standard\" for determining outdoor air pollution. However, AQS data are limited because the monitoring stations are usually in urban areas or cities and because they only take air samples for some air pollutants every three days or during times of the year when air pollution is very high. CDC and EPA have worked together to develop a statistical model (Downscaler) to make modeled predictions available for environmental public health tracking purposes in areas of the country that do not have monitors and to fill in the time gaps when monitors may not be recording data. This data does not include \"Percent of population in counties exceeding NAAQS (vs. population in counties that either meet the standard or do not monitor PM2.5)\". Please visit the Tracking homepage for this information.View additional information for indicator definitions and documentation by selecting Content Area \"Air Quality\" and the respective indicator at the following website: http://ephtracking.cdc.gov/showIndicatorsData.action",
      |      "displayType" : "table",
      |      "downloadCount" : 11407,
      |      "hideFromCatalog" : false,
      |      "hideFromDataJson" : false,
      |      "indexUpdatedAt" : 1456840785,
      |      "newBackend" : false,
      |      "numberOfComments" : 0,
      |      "oid" : 12801487,
      |      "provenance" : "official",
      |      "publicationAppendEnabled" : false,
      |      "publicationDate" : 1439474950,
      |      "publicationGroup" : 3957835,
      |      "publicationStage" : "published",
      |      "rowClass" : "",
      |      "rowsUpdatedAt" : 1439402317,
      |      "rowsUpdatedBy" : "94g5-7as2",
      |      "tableId" : 3960642,
      |      "totalTimesRated" : 0,
      |      "viewCount" : 1844,
      |      "viewLastModified" : 1440712174,
      |      "viewType" : "tabular",
      |      "columns" : [ {
      |        "id" : -1,
      |        "name" : "sid",
      |        "dataTypeName" : "meta_data",
      |        "fieldName" : ":sid",
      |        "position" : 0,
      |        "renderTypeName" : "meta_data",
      |        "format" : { },
      |        "flags" : [ "hidden" ]
      |      }, {
      |        "id" : -1,
      |        "name" : "id",
      |        "dataTypeName" : "meta_data",
      |        "fieldName" : ":id",
      |        "position" : 0,
      |        "renderTypeName" : "meta_data",
      |        "format" : { },
      |        "flags" : [ "hidden" ]
      |      }, {
      |        "id" : -1,
      |        "name" : "position",
      |        "dataTypeName" : "meta_data",
      |        "fieldName" : ":position",
      |        "position" : 0,
      |        "renderTypeName" : "meta_data",
      |        "format" : { },
      |        "flags" : [ "hidden" ]
      |      }, {
      |        "id" : -1,
      |        "name" : "created_at",
      |        "dataTypeName" : "meta_data",
      |        "fieldName" : ":created_at",
      |        "position" : 0,
      |        "renderTypeName" : "meta_data",
      |        "format" : { },
      |        "flags" : [ "hidden" ]
      |      }, {
      |        "id" : -1,
      |        "name" : "created_meta",
      |        "dataTypeName" : "meta_data",
      |        "fieldName" : ":created_meta",
      |        "position" : 0,
      |        "renderTypeName" : "meta_data",
      |        "format" : { },
      |        "flags" : [ "hidden" ]
      |      }, {
      |        "id" : -1,
      |        "name" : "updated_at",
      |        "dataTypeName" : "meta_data",
      |        "fieldName" : ":updated_at",
      |        "position" : 0,
      |        "renderTypeName" : "meta_data",
      |        "format" : { },
      |        "flags" : [ "hidden" ]
      |      }, {
      |        "id" : -1,
      |        "name" : "updated_meta",
      |        "dataTypeName" : "meta_data",
      |        "fieldName" : ":updated_meta",
      |        "position" : 0,
      |        "renderTypeName" : "meta_data",
      |        "format" : { },
      |        "flags" : [ "hidden" ]
      |      }, {
      |        "id" : -1,
      |        "name" : "meta",
      |        "dataTypeName" : "meta_data",
      |        "fieldName" : ":meta",
      |        "position" : 0,
      |        "renderTypeName" : "meta_data",
      |        "format" : { },
      |        "flags" : [ "hidden" ]
      |      }, {
      |        "id" : 217182091,
      |        "name" : "MeasureId",
      |        "dataTypeName" : "number",
      |        "description" : "Unique identifier for Measure Name used within the Environmental Health Tracking Network",
      |        "fieldName" : "measureid",
      |        "position" : 1,
      |        "renderTypeName" : "number",
      |        "tableColumnId" : 30482153,
      |        "width" : 138,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "average" : "248.4369794406202",
      |          "largest" : "296",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "83",
      |            "count" : 20
      |          }, {
      |            "item" : "84",
      |            "count" : 19
      |          }, {
      |            "item" : "85",
      |            "count" : 18
      |          }, {
      |            "item" : "86",
      |            "count" : 17
      |          }, {
      |            "item" : "87",
      |            "count" : 16
      |          }, {
      |            "item" : "292",
      |            "count" : 15
      |          }, {
      |            "item" : "293",
      |            "count" : 14
      |          }, {
      |            "item" : "294",
      |            "count" : 13
      |          }, {
      |            "item" : "295",
      |            "count" : 12
      |          }, {
      |            "item" : "296",
      |            "count" : 11
      |          } ],
      |          "smallest" : "83",
      |          "sum" : "54317019"
      |        },
      |        "format" : {
      |          "precisionStyle" : "standard",
      |          "noCommas" : "false",
      |          "align" : "right"
      |        }
      |      }, {
      |        "id" : 217182092,
      |        "name" : "MeasureName",
      |        "dataTypeName" : "text",
      |        "description" : "Unique name created by National Environmental Health Tracking Network to identify and clearly describe data presented",
      |        "fieldName" : "measurename",
      |        "position" : 2,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482154,
      |        "width" : 232,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "Person-days with PM2.5 over the National Ambient Air Quality Standard",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard",
      |            "count" : 20
      |          }, {
      |            "item" : "Number of person-days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard",
      |            "count" : 19
      |          }, {
      |            "item" : "Percent of days with PM2.5 levels over the National Ambient Air Quality Standard (NAAQS)",
      |            "count" : 18
      |          }, {
      |            "item" : "Person-days with PM2.5 over the National Ambient Air Quality Standard",
      |            "count" : 17
      |          }, {
      |            "item" : "Annual average ambient concentrations of PM2.5 in micrograms per cubic meter (based on seasonal averages and daily measurement)",
      |            "count" : 16
      |          }, {
      |            "item" : "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard (monitor and modeled data)",
      |            "count" : 15
      |          }, {
      |            "item" : "Number of person-days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard (monitor and modeled data)",
      |            "count" : 14
      |          }, {
      |            "item" : "Percent of days with PM2.5 levels over the National Ambient Air Quality Standard (monitor and modeled data)",
      |            "count" : 13
      |          }, {
      |            "item" : "Number of person-days with PM2.5 over the National Ambient Air Quality Standard (monitor and modeled data)",
      |            "count" : 12
      |          }, {
      |            "item" : "Annual average ambient concentrations of PM 2.5 in micrograms per cubic meter, based on seasonal averages and daily measurement (monitor and modeled data)",
      |            "count" : 11
      |          } ],
      |          "smallest" : "Annual average ambient concentrations of PM 2.5 in micrograms per cubic meter, based on seasonal averages and daily measurement (monitor and modeled data)"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182093,
      |        "name" : "MeasureType",
      |        "dataTypeName" : "text",
      |        "description" : "Type of data value being captured (e.g. Average, Count, Prevalence, etc.)",
      |        "fieldName" : "measuretype",
      |        "position" : 3,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482155,
      |        "width" : 151,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "Percent",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "Counts",
      |            "count" : 20
      |          }, {
      |            "item" : "Percent",
      |            "count" : 19
      |          }, {
      |            "item" : "Average",
      |            "count" : 18
      |          } ],
      |          "smallest" : "Average"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182094,
      |        "name" : "StratificationLevel",
      |        "dataTypeName" : "text",
      |        "description" : "Geogrpahic resolution by which data is captured and presented",
      |        "fieldName" : "stratificationlevel",
      |        "position" : 4,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482156,
      |        "width" : 192,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "State x County",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "State x County",
      |            "count" : 20
      |          } ],
      |          "smallest" : "State x County"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182095,
      |        "name" : "StateFips",
      |        "dataTypeName" : "text",
      |        "description" : "Unique two-digit numeric code assigned to each state in the United States.",
      |        "fieldName" : "statefips",
      |        "position" : 5,
      |        "rdfProperties" : "",
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482157,
      |        "width" : 131,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "9",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "1",
      |            "count" : 20
      |          }, {
      |            "item" : "6",
      |            "count" : 19
      |          }, {
      |            "item" : "8",
      |            "count" : 18
      |          }, {
      |            "item" : "12",
      |            "count" : 17
      |          }, {
      |            "item" : "13",
      |            "count" : 16
      |          }, {
      |            "item" : "17",
      |            "count" : 15
      |          }, {
      |            "item" : "18",
      |            "count" : 14
      |          }, {
      |            "item" : "19",
      |            "count" : 13
      |          }, {
      |            "item" : "21",
      |            "count" : 12
      |          }, {
      |            "item" : "22",
      |            "count" : 11
      |          }, {
      |            "item" : "26",
      |            "count" : 10
      |          }, {
      |            "item" : "27",
      |            "count" : 9
      |          }, {
      |            "item" : "28",
      |            "count" : 8
      |          }, {
      |            "item" : "36",
      |            "count" : 7
      |          }, {
      |            "item" : "37",
      |            "count" : 6
      |          }, {
      |            "item" : "39",
      |            "count" : 5
      |          }, {
      |            "item" : "40",
      |            "count" : 4
      |          }, {
      |            "item" : "42",
      |            "count" : 3
      |          }, {
      |            "item" : "45",
      |            "count" : 2
      |          }, {
      |            "item" : "47",
      |            "count" : 1
      |          } ],
      |          "smallest" : "1"
      |        },
      |        "format" : {
      |          "rdf" : "",
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182096,
      |        "name" : "StateName",
      |        "dataTypeName" : "text",
      |        "description" : "Name of state in the United States.",
      |        "fieldName" : "statename",
      |        "position" : 6,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482158,
      |        "width" : 130,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "Wyoming",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "Alabama",
      |            "count" : 20
      |          }, {
      |            "item" : "California",
      |            "count" : 19
      |          }, {
      |            "item" : "Colorado",
      |            "count" : 18
      |          }, {
      |            "item" : "Florida",
      |            "count" : 17
      |          }, {
      |            "item" : "Georgia",
      |            "count" : 16
      |          }, {
      |            "item" : "Illinois",
      |            "count" : 15
      |          }, {
      |            "item" : "Indiana",
      |            "count" : 14
      |          }, {
      |            "item" : "Iowa",
      |            "count" : 13
      |          }, {
      |            "item" : "Kentucky",
      |            "count" : 12
      |          }, {
      |            "item" : "Louisiana",
      |            "count" : 11
      |          }, {
      |            "item" : "Michigan",
      |            "count" : 10
      |          }, {
      |            "item" : "Minnesota",
      |            "count" : 9
      |          }, {
      |            "item" : "Mississippi",
      |            "count" : 8
      |          }, {
      |            "item" : "New York",
      |            "count" : 7
      |          }, {
      |            "item" : "North Carolina",
      |            "count" : 6
      |          }, {
      |            "item" : "Ohio",
      |            "count" : 5
      |          }, {
      |            "item" : "Oklahoma",
      |            "count" : 4
      |          }, {
      |            "item" : "Pennsylvania",
      |            "count" : 3
      |          }, {
      |            "item" : "South Carolina",
      |            "count" : 2
      |          }, {
      |            "item" : "Tennessee",
      |            "count" : 1
      |          } ],
      |          "smallest" : "Alabama"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182097,
      |        "name" : "CountyFips",
      |        "dataTypeName" : "text",
      |        "description" : "Unique five-digit code assigned to each county in the United States. The first two digits are the state FIPS code and the last three digits correspond to the county within that state.",
      |        "fieldName" : "countyfips",
      |        "position" : 7,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482159,
      |        "width" : 140,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "9015",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "56035",
      |            "count" : 20
      |          }, {
      |            "item" : "56037",
      |            "count" : 19
      |          }, {
      |            "item" : "56039",
      |            "count" : 18
      |          }, {
      |            "item" : "56041",
      |            "count" : 17
      |          }, {
      |            "item" : "56043",
      |            "count" : 16
      |          }, {
      |            "item" : "56045",
      |            "count" : 15
      |          } ],
      |          "smallest" : "10001"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182098,
      |        "name" : "CountyName",
      |        "dataTypeName" : "text",
      |        "description" : "Name of county within the state",
      |        "fieldName" : "countyname",
      |        "position" : 8,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482160,
      |        "width" : 151,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "Ziebach",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "Sublette",
      |            "count" : 20
      |          }, {
      |            "item" : "Sweetwater",
      |            "count" : 19
      |          }, {
      |            "item" : "Teton",
      |            "count" : 18
      |          }, {
      |            "item" : "Uinta",
      |            "count" : 17
      |          }, {
      |            "item" : "Washakie",
      |            "count" : 16
      |          }, {
      |            "item" : "Weston",
      |            "count" : 15
      |          } ],
      |          "smallest" : "Abbeville"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182099,
      |        "name" : "ReportYear",
      |        "dataTypeName" : "text",
      |        "description" : "Data report year",
      |        "fieldName" : "reportyear",
      |        "position" : 9,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482161,
      |        "width" : 143,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "2013",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "1999",
      |            "count" : 20
      |          }, {
      |            "item" : "2000",
      |            "count" : 19
      |          }, {
      |            "item" : "2001",
      |            "count" : 18
      |          }, {
      |            "item" : "2002",
      |            "count" : 17
      |          }, {
      |            "item" : "2003",
      |            "count" : 16
      |          }, {
      |            "item" : "2004",
      |            "count" : 15
      |          }, {
      |            "item" : "2005",
      |            "count" : 14
      |          }, {
      |            "item" : "2006",
      |            "count" : 13
      |          }, {
      |            "item" : "2007",
      |            "count" : 12
      |          }, {
      |            "item" : "2008",
      |            "count" : 11
      |          }, {
      |            "item" : "2009",
      |            "count" : 10
      |          }, {
      |            "item" : "2010",
      |            "count" : 9
      |          }, {
      |            "item" : "2011",
      |            "count" : 8
      |          }, {
      |            "item" : "2012",
      |            "count" : 7
      |          }, {
      |            "item" : "2013",
      |            "count" : 6
      |          } ],
      |          "smallest" : "1999"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182100,
      |        "name" : "Value",
      |        "dataTypeName" : "number",
      |        "description" : "Data value specific to data measure in the stratified geography",
      |        "fieldName" : "value",
      |        "position" : 10,
      |        "renderTypeName" : "number",
      |        "tableColumnId" : 30482162,
      |        "width" : 110,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "average" : "649964.9118505982",
      |          "largest" : "1084153095",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "0",
      |            "count" : 20
      |          }, {
      |            "item" : "1",
      |            "count" : 19
      |          }, {
      |            "item" : "0.27397260273972601",
      |            "count" : 18
      |          }, {
      |            "item" : "0.54794520547945202",
      |            "count" : 17
      |          }, {
      |            "item" : "7.9151719205479401",
      |            "count" : 16
      |          }, {
      |            "item" : "6.1315808356164396",
      |            "count" : 15
      |          }, {
      |            "item" : "6.9196157205479496",
      |            "count" : 14
      |          }, {
      |            "item" : "6.3236561366120299",
      |            "count" : 13
      |          }, {
      |            "item" : "6.1095928054794504",
      |            "count" : 12
      |          }, {
      |            "item" : "6.4436848054794504",
      |            "count" : 11
      |          }, {
      |            "item" : "6.2071264410958902",
      |            "count" : 10
      |          }, {
      |            "item" : "6.3697641557377098",
      |            "count" : 9
      |          }, {
      |            "item" : "6.24170825753425",
      |            "count" : 8
      |          }, {
      |            "item" : "6.1259572876712296",
      |            "count" : 7
      |          }, {
      |            "item" : "6.6464644109588997",
      |            "count" : 6
      |          } ],
      |          "smallest" : "0",
      |          "sum" : "142105078502.45554529049610238"
      |        },
      |        "format" : {
      |          "precisionStyle" : "standard",
      |          "noCommas" : "false",
      |          "align" : "right"
      |        }
      |      }, {
      |        "id" : 217182101,
      |        "name" : "Unit",
      |        "dataTypeName" : "text",
      |        "description" : "Shorthand unit name for the specific measure",
      |        "fieldName" : "unit",
      |        "position" : 11,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482163,
      |        "width" : 103,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "No Units",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "No Units",
      |            "count" : 20
      |          }, {
      |            "item" : "%",
      |            "count" : 19
      |          }, {
      |            "item" : "µg/m³",
      |            "count" : 18
      |          } ],
      |          "smallest" : "%"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182102,
      |        "name" : "UnitName",
      |        "dataTypeName" : "text",
      |        "description" : "Long unit name for the specific measure",
      |        "fieldName" : "unitname",
      |        "position" : 12,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482164,
      |        "width" : 135,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "Percent",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "No Units",
      |            "count" : 20
      |          }, {
      |            "item" : "Percent",
      |            "count" : 19
      |          }, {
      |            "item" : "Micograms per cubic meter",
      |            "count" : 18
      |          } ],
      |          "smallest" : "Micograms per cubic meter"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182103,
      |        "name" : "DataOrigin",
      |        "dataTypeName" : "text",
      |        "description" : "Indicates if the data is monitor only (AQS data), or if it is monitor and modeled (with Downscaler modeled predictions for counties and days without monitoring data)",
      |        "fieldName" : "dataorigin",
      |        "position" : 13,
      |        "renderTypeName" : "text",
      |        "tableColumnId" : 30482165,
      |        "width" : 137,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "largest" : "Monitor Only",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "Monitor Only",
      |            "count" : 20
      |          }, {
      |            "item" : "Monitor & Modeled",
      |            "count" : 19
      |          } ],
      |          "smallest" : "Monitor & Modeled"
      |        },
      |        "format" : {
      |          "align" : "left"
      |        }
      |      }, {
      |        "id" : 217182104,
      |        "name" : "MonitorOnly",
      |        "dataTypeName" : "number",
      |        "description" : "Flags if data is Monitor only, compared to monitor and modeled data.",
      |        "fieldName" : "monitoronly",
      |        "position" : 14,
      |        "renderTypeName" : "number",
      |        "tableColumnId" : 30482166,
      |        "width" : 149,
      |        "cachedContents" : {
      |          "non_null" : 218635,
      |          "average" : "0.3839504196491870",
      |          "largest" : "1",
      |          "null" : 0,
      |          "top" : [ {
      |            "item" : "1",
      |            "count" : 20
      |          }, {
      |            "item" : "0",
      |            "count" : 19
      |          } ],
      |          "smallest" : "0",
      |          "sum" : "83945"
      |        },
      |        "format" : {
      |          "precisionStyle" : "standard",
      |          "noCommas" : "false",
      |          "align" : "right"
      |        }
      |      } ],
      |      "grants" : [ {
      |        "inherited" : false,
      |        "type" : "viewer",
      |        "flags" : [ "public" ]
      |      } ],
      |      "metadata" : {
      |        "jsonQuery" : {
      |          "order" : [ {
      |            "ascending" : true,
      |            "columnFieldName" : "statefips"
      |          } ]
      |        },
      |        "rdfSubject" : "0",
      |        "rdfClass" : "",
      |        "custom_fields" : {
      |          "Common Core" : {
      |            "Contact Email" : "cak8@cdc.gov",
      |            "Homepage" : "http://ephtracking.cdc.gov/",
      |            "Language" : "English",
      |            "Contact Name" : "Craig Kassinger",
      |            "Update Frequency" : "irregular",
      |            "Program Code" : "009:032",
      |            "Publisher" : "Environmental Health Tracking Network",
      |            "Is Quality Data" : "yes",
      |            "Bureau Code" : "009:20"
      |          }
      |        },
      |        "rowIdentifier" : "0",
      |        "availableDisplayTypes" : [ "table", "fatrow", "page" ],
      |        "rowLabel" : "Observation",
      |        "renderTypeConfig" : {
      |          "visible" : {
      |            "table" : true
      |          }
      |        }
      |      },
      |      "owner" : {
      |        "id" : "94g5-7as2",
      |        "displayName" : "Tracking",
      |        "screenName" : "Tracking",
      |        "type" : "interactive",
      |        "flags" : [ "siteMember" ]
      |      },
      |      "query" : {
      |        "orderBys" : [ {
      |          "ascending" : true,
      |          "expression" : {
      |            "columnId" : 217182095,
      |            "type" : "column"
      |          }
      |        } ]
      |      },
      |      "rights" : [ "read" ],
      |      "tableAuthor" : {
      |        "id" : "94g5-7as2",
      |        "displayName" : "Tracking",
      |        "screenName" : "Tracking",
      |        "type" : "interactive",
      |        "flags" : [ "siteMember" ]
      |      },
      |      "tags" : [ "environmental hazard", "air quality", "air quality system", "daily maximum 8 hour average concentration", "daily 24 hour average concentration", "hourly observations", "site monitoring data", "regulatory resources", "national ambient air quality standards", "caa 109: clean air act section 109", "o3", "ozone - residual", "ozone residual", "ozone", "pm2.5", "particulate matter", "particulate matter < 2.5 um", "pm fine 0-2.5 um stp", "pm2.5 - local conditions", "particulate matter - pm2.5", "air pollution", "air quality index", "oxygen", "particle pollution", "environmental health", "tracking", "tracking network", "national environmental health tracking network", "tracking program" ],
      |      "flags" : [ "default", "restorable", "restorePossibleForType" ]
      |    }
      |  }
      |}
    """.stripMargin
  test("parse: get all columns metadata") {
    val parser = new DataParser("")

    val parsed = parse(json)

    val parsedMetadata = parser.toParsed(parsed)

    parsedMetadata.columns.size shouldBe(14)
  }
}
