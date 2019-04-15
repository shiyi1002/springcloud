package com.qf.springcloudwebadminribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableDiscoveryClient
public class SpringcloudWebAdminRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudWebAdminRibbonApplication.class, args);
	}

}
