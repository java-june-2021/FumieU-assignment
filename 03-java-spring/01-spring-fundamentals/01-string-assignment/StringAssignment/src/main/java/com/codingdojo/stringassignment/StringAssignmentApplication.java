package com.codingdojo.stringassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringAssignmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(StringAssignmentApplication.class, args);
    }
    @RequestMapping("/")
    public String hello() { 
            return "Hello Client! How are you doing?";
    }
    @RequestMapping("/random")
    public String random() { 
            return "Spring boot is great So easy to respond with strings!";
    }
}