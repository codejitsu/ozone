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
      |  },
      |  "data" : [ [ 2, "0CEF0EA4-44D1-43F9-B7A3-BA8760697583", 2, 1439356237, "925122", 1439356237, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "1", "Alabama", "1051", "Elmore", "1999", "5", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 3, "CA5C8F9E-7EC2-4E85-A30E-5A35FCFAACFB", 3, 1439356237, "925122", 1439356237, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "1", "Alabama", "1073", "Jefferson", "1999", "39", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 4, "68F7582C-A09A-46E1-AD74-B836A56BAD83", 4, 1439356237, "925122", 1439356237, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "1", "Alabama", "1079", "Lawrence", "1999", "28", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 5, "93AA53D9-876D-4E13-BE48-04400823ED3B", 5, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "1", "Alabama", "1089", "Madison", "1999", "31", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 6, "0DD294DF-6903-40A8-92A6-E306F59DB4F4", 6, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "1", "Alabama", "1097", "Mobile", "1999", "32", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 7, "BEA09B49-6497-49CB-AB3C-6C6BACE9F098", 7, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "1", "Alabama", "1101", "Montgomery", "1999", "15", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 8, "B30956B2-B42A-4095-A29E-5F220679E97B", 8, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "1", "Alabama", "1117", "Shelby", "1999", "45", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 9, "C28A44C9-C745-4D78-9CBB-188F1BA37120", 9, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "1", "Alabama", "1119", "Sumter", "1999", "3", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 10, "589F2287-B0EA-4149-9339-05CE5EAFA3D0", 10, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "2", "Alaska", "2068", "Denali", "1999", "0", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 11, "5DD67EC2-553B-439C-A9BD-6FFF46E9CDC3", 11, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "4", "Arizona", "4003", "Cochise", "1999", "1", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 12, "6DEC514E-F3F4-4F54-8B69-7D7354381EE4", 12, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "4", "Arizona", "4005", "Coconino", "1999", "5", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 13, "DFE129DE-DCA6-4177-9D6A-5878C1F09D33", 13, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "4", "Arizona", "4007", "Gila", "1999", "10", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 14, "8642B2B3-20B0-42E4-98F3-7BE0E83543CC", 14, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "4", "Arizona", "4013", "Maricopa", "1999", "85", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 15, "BE5F88B9-7846-46AB-83FC-86442DC710AB", 15, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "4", "Arizona", "4019", "Pima", "1999", "2", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 16, "B5ABE43C-F596-43D2-9131-229ED02F52EE", 16, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "4", "Arizona", "4025", "Yavapai", "1999", "13", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 17, "4B3E3CD5-1774-43DD-B1E3-D235E42B8181", 17, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "4", "Arizona", "4027", "Yuma", "1999", "6", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 18, "8F46E550-47BB-475C-A4E2-6D35CE981DC6", 18, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "5", "Arkansas", "5035", "Crittenden", "1999", "30", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 19, "1125862C-56E3-4744-B518-FA67EA2CD23D", 19, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "5", "Arkansas", "5097", "Montgomery", "1999", "3", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 20, "DE000936-3590-4E40-8761-628373B07043", 20, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "5", "Arkansas", "5101", "Newton", "1999", "8", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 21, "73F7A379-718F-4A54-A290-6CB8CA0F4D6D", 21, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "5", "Arkansas", "5119", "Pulaski", "1999", "15", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 22, "F9EC6A07-EAE4-46CA-B3F0-81C2EDCB067A", 22, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6001", "Alameda", "1999", "15", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 23, "9AB79EE3-17AB-48C7-A956-91A28903C680", 23, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6005", "Amador", "1999", "45", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 24, "215B3E49-6FE0-497D-BB4D-1483A005E02B", 24, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6007", "Butte", "1999", "14", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 25, "DE01DA22-6A89-4273-A696-B1BA7B2AAB43", 25, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6009", "Calaveras", "1999", "53", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 26, "248D628C-D4F3-4584-A702-86F9B0F57046", 26, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6011", "Colusa", "1999", "5", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 27, "9167011A-E692-466C-B338-906E5A44229F", 27, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6013", "Contra Costa", "1999", "8", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 28, "F6A7FE7D-A9F7-432B-8DE7-F235CFD8DF58", 28, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6017", "El Dorado", "1999", "67", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 29, "CB260D86-F32C-4395-B8E0-2060286BA32B", 29, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6019", "Fresno", "1999", "121", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 30, "F1373E40-CE98-4181-A8CA-7D02A63D54FE", 30, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6021", "Glenn", "1999", "14", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 31, "3A01F89F-24C5-4A68-B59B-EA0A22A89A41", 31, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6025", "Imperial", "1999", "34", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 32, "EDF1AEA1-5700-4E7F-B605-293BD4FAA37F", 32, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6027", "Inyo", "1999", "10", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 33, "7A5C1AFB-623E-46F1-AF71-A869C14207A2", 33, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6029", "Kern", "1999", "129", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 34, "F3ED6F8F-73C3-473B-8179-280F1E8D0679", 34, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6031", "Kings", "1999", "68", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 35, "0E05EB8C-4244-4E50-8899-F47DB21A930E", 35, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6037", "Los Angeles", "1999", "42", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 36, "49BA2447-D840-4FD9-AAA6-A5D2FD0DA297", 36, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6039", "Madera", "1999", "29", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 37, "54CBA2BC-6457-450A-BF86-E7D8CC26DB15", 37, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6041", "Marin", "1999", "1", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 38, "28461771-8362-468E-8B12-DBD26AC84FA8", 38, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6043", "Mariposa", "1999", "67", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 39, "333F253D-9188-4C58-BEEB-173620B01D6C", 39, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6047", "Merced", "1999", "77", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 40, "8F7CF5C2-DDA6-4819-86FD-6B5AE2D37BFD", 40, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6053", "Monterey", "1999", "0", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 41, "E70959CB-B267-48E6-9C05-614F8DB4D81F", 41, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6055", "Napa", "1999", "5", "No Units", "No Units", "Monitor Only", "1" ]
      |, [ 42, "20618669-542F-4921-9A07-9F080BB33135", 42, 1439356238, "925122", 1439356238, "925122", null, "83", "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard", "Counts", "State x County", "6", "California", "6057", "Nevada", "1999", "69", "No Units", "No Units", "Monitor Only", "1" ]
      |]
      |}
    """.stripMargin
  test("parse: get all columns metadata") {
    val parser = new DataParser("")

    val parsed = parse(json)

    val parseData = parser.toParsed(parsed)

    parseData.columns.size shouldBe(22)
  }

  test("parse: get all rows data") {
    val parser = new DataParser("")

    val parsed = parse(json)

    val parseData = parser.toParsed(parsed)

    /*
    [
      sid = 2,
      id = "0CEF0EA4-44D1-43F9-B7A3-BA8760697583",
      position = 2,
      created_at = 1439356237,
      created_meta = "925122",
      updated_at = 1439356237,
      updated_meta = "925122",
      meta = null,
      measureid = "83",
      measurename = "Number of days with maximum 8-hour average ozone concentration over the National Ambient Air Quality Standard",
      measuretype = "Counts",
      stratificationlevel = "State x County",
      statefips = "1",
      statename = "Alabama",
      countyfips = "1051",
      countyname = "Elmore",
      reportyear = "1999",
      value = "5",
      unit = "No Units",
      unitname = "No Units",
      dataorigin = "Monitor Only",
      monitoronly = "1"
     ]
    */

    //parseData.rows.foreach(println)

    parseData.rows.size shouldBe(41)
  }
}
