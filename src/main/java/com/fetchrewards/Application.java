package com.fetchrewards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    //Starting the spring app with the embedded tomcat server.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
