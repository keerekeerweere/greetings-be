package com.compea.greetings.greetingsbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication(scanBasePackages = {"com.compea.greetings.greetingsbe.controller"})
public class GreetingBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingBeApplication.class, args);
    }

}
