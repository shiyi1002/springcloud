package com.qf.springcloudserviceadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
public class SpringcloudServiceAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServiceAdminApplication.class, args);
	}

}
