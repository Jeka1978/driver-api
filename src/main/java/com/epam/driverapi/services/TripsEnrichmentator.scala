package com.epam.driverapi.services

import com.epam.driverapi.repo.TripsRepo
import org.springframework.stereotype.Service

/**
 * @author Evgeny Borisov
 */
@Service
class TripsEnrichmentator(tripsRepo: TripsRepo, driverService: DriverService) {

  def printTripsWithDriversAge() = {
    val drivers = driverService.getAllDrivers
    val tripsDataframe = tripsRepo.readTrips()
    tripsDataframe.withColumn("age",udfWhichGetAnAge).show()
  }

}
