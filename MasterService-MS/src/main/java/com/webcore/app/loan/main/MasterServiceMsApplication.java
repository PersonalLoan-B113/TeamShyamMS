package com.webcore.app.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MasterServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterServiceMsApplication.class, args);
	}

}
