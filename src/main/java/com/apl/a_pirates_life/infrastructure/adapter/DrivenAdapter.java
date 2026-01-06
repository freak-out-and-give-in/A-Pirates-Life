package com.apl.a_pirates_life.infrastructure.adapter;

import com.apl.a_pirates_life.infrastructure.port.DrivenPort;

public class DrivenAdapter implements DrivenPort {

    @Override
    public void save(String msg) {
        System.out.println("Saved: " + msg);
    }
}
