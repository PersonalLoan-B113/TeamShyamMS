package com.webcore.app.ms.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class MasterServiceMSRegisterDataApplication
{
	public static void main(String[] args)
	{
		System.out.println("MasterService Register Data");
		SpringApplication.run(MasterServiceMSRegisterDataApplication.class, args);
	}
}
