package com.compea.greetings.be;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class GreetingBeApplicationTests {

    @Autowired
    private GreetingBeApplication greetingBeApplication;



    @Test
    void contextLoads() {
    }



    @Test
    void findByNumber_returnsZeroWhenInputIsLessThanOrEqualToOne() {
        int input = 0;
        assertEquals(0, greetingBeApplication.findByNumber(input));

        input = 1;
        assertEquals(1, greetingBeApplication.findByNumber(input));
    }
}

