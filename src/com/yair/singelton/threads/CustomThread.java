package com.yair.singelton.threads;


import com.yair.singelton.logging.Logger;
import com.yair.singelton.logging.enums.LogLevel;

import java.util.Random;

public class CustomThread extends Thread {
    private final Logger logger = Logger.getInstance();

    int rndEnum = new Random().nextInt(LogLevel.values().length);


    @Override
    public void run() {
        logger.log(LogLevel.values()[rndEnum], "Logging from " + getName());
    }
}
