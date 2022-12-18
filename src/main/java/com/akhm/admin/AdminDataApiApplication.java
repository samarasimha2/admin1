package com.akhm.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminDataApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminDataApiApplication.class, args);
	}

}
