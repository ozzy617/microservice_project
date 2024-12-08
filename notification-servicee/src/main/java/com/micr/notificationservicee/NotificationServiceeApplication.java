package com.micr.notificationservicee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NotificationServiceeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceeApplication.class, args);
    }

}
