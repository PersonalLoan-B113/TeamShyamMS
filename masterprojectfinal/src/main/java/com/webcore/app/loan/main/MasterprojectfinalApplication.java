package com.webcore.app.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class MasterprojectfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterprojectfinalApplication.class, args);
		System.out.println("app start");
	}

}
