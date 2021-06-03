package com.epam.driverapi.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class BenchmarkAspect {


    @After("@annotation(com.epam.driverapi.PrintToLog)")
    public void printToLog() {
        System.out.println("DEKEL DEKEL");
    }


}



