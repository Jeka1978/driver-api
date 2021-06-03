package com.epam.driverapi;

import org.springframework.context.annotation.Primary;

/**
 * @author Evgeny Borisov
 */
@DekelComponent
public final class DekelServiceImpl implements DekelService {
    @Override
    @PrintToLog
    public void stam(){
        System.out.println("STAM");
    }
    @Override
    public void doWork() {
        System.out.println("DEKEL work");
    }
}
