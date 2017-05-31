package com.supercars.carrentalportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CarRentalPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalPortalApplication.class, args);
	}
}
