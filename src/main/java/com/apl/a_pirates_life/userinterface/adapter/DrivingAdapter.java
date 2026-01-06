package com.apl.a_pirates_life.userinterface.adapter;

import com.apl.a_pirates_life.application.port.DrivingPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DrivingAdapter {

    private final DrivingPort drivingPort;

    @Autowired
    public DrivingAdapter(DrivingPort drivingPort) {
        this.drivingPort = drivingPort;
    }

    @GetMapping("/hi")
    public ModelAndView hi() {
        drivingPort.printHello();

        return new ModelAndView("/index.html");
    }
}
