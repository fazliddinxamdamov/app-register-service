package com.fazliddin.appregisterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppRegisterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppRegisterServiceApplication.class, args);
    }

}
