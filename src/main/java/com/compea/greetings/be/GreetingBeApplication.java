package com.compea.greetings.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication(scanBasePackages = {"com.compea.greetings.be.controller"})
public class GreetingBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingBeApplication.class, args);
    }
    
    public int findByNumber(int number) {
        if (number <= 1) {
            return number;
        } else {
            int first = findByNumber(number - 1);
            int second = findByNumber(number - 2);
            return first + second;
        }
    }


}
