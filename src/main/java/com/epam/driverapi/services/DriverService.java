package com.epam.driverapi.services;

import com.epam.driverapi.model.Driver;
import com.epam.driverapi.repo.DriverRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private Faker faker;


    @PersistenceContext
    private EntityManager entityManager;
    private Driver driver;


    @Transactional
    public void addAgeToDriver() {
//        driverRepository.save(driver);
        driver.setAge(666);
        entityManager.merge(driver);
        driver.setAge(666);
        driver.setAge(667);
    }


    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public void addNewDriver() {
        Driver johnSnow = Driver.builder().name("John SNOW").age(250).build();
        System.out.println();
        driverRepository.save(johnSnow);
        johnSnow.setAge(10000);
        System.out.println();
    }


    @Transactional
    public void incAge() {
        Iterable<Driver> drivers = driverRepository.findAll();
        drivers.forEach(driver -> driver.setAge(777));

    }


    @EventListener(ContextRefreshedEvent.class)
    public void fillDrivers() {
        Driver driver=null;
        for (int i = 0; i < 3; i++) {
            driver = driverRepository.save(Driver.builder().age(faker.random().nextInt(120)).name(faker.gameOfThrones().character()).build());
        }
        this.driver = driver;
    }

}








