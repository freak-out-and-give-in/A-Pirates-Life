package com.apl.a_pirates_life.infrastructure.configuration;

import com.apl.a_pirates_life.application.port.DrivingPort;
import com.apl.a_pirates_life.application.service.Service;
import com.apl.a_pirates_life.infrastructure.adapter.DrivenAdapter;
import com.apl.a_pirates_life.infrastructure.port.DrivenPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    DrivingPort drivingPort(DrivenPort drivenPort) {
        return new Service(drivenPort);
    }

    @Bean
    DrivenPort drivenPort() {
        return new DrivenAdapter();
    }

}
