package com.epam.driverapi.controllers;

import com.epam.driverapi.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api/drivers/")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("incage")
    public void updateDrivers(){
        driverService.incAge();
    }




    @GetMapping("add")
    public void addDriver(){
        driverService.addNewDriver();
    }
    @GetMapping("addage")
    public void addDriverAge(){
        driverService.addAgeToDriver();
    }
}
