package com.example.jmsassignmentapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsAssignmentApplication.class, args);
    }

}
