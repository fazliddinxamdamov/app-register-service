package com.fazliddin.appregisterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppRegisterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppRegisterServiceApplication.class, args);
    }

}
