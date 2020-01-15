package com.iuoooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class testApp {
    public static void main(String[] args) {
        SpringApplication.run(testApp.class,args);
    }
}
