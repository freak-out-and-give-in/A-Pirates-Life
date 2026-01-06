package com.apl.a_pirates_life.application.service;

import com.apl.a_pirates_life.application.port.DrivingPort;
import com.apl.a_pirates_life.infrastructure.port.DrivenPort;
import org.springframework.beans.factory.annotation.Autowired;

public class Service implements DrivingPort {

    private final DrivenPort drivenPort;

    @Autowired
    public Service(DrivenPort drivenPort) {
        this.drivenPort = drivenPort;
    }

    public void printHello() {
        System.out.println("hello");
    }

    public void saveHello() {
        drivenPort.save("hello");
    }
}
