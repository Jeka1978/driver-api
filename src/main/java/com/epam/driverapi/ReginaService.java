package com.epam.driverapi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Qualifier("regina")
public  class ReginaService implements SuperService{
    @PrintToLog
    public void doRegina(){
        System.out.println("regina!!!!");
    }

    @Override
    public void doWork() {
        System.out.println("Regina work");
    }
}
