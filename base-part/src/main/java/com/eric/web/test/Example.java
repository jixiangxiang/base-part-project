package com.eric.web.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by eric on 2017/10/13.
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/test")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String note(){
        return new Date().toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
