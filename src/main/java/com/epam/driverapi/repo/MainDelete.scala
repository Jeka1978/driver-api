package com.epam.driverapi.repo

import com.epam.driverapi.model.Trip
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}

/**
 * @author Evgeny Borisov
 */
object MainDelete {
  def main(args: Array[String]): Unit = {

    val sparkSession:SparkSession = SparkSession.builder().master("local[*]").appName("taxi/trips.txt").getOrCreate()

    val simpleSchema = StructType(Array(
      StructField("id",StringType,true),
      StructField("city",StringType,true),
      StructField("km", IntegerType, true)
    ))


    val schema = org.apache.spark.sql.Encoders.product[Trip].schema
//    sparkSession.read.option("delimiter", " ").schema(simpleSchema).csv("taxi/trips.txt").show()
    sparkSession.read.option("delimiter", " ").csv("taxi/trips.txt").show()

  }
}
