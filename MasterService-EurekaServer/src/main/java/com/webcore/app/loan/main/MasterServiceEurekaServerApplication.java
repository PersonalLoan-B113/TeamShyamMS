package com.webcore.app.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MasterServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterServiceEurekaServerApplication.class, args);
	}

}
