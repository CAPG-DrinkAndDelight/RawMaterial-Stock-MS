package com.capgemini.drinkanddelight.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DdeightRawMaterialStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(DdeightRawMaterialStockApplication.class, args);
	}

}
