package com.everis.bankgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class BankgatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankgatewayserverApplication.class, args);
	}

}
