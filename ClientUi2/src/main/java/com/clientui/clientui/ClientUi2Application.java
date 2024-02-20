package com.clientui.clientui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.clientui.clientui")
public class ClientUi2Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientUi2Application.class, args);
    }

}
