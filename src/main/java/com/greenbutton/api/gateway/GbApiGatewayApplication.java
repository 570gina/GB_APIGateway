package com.greenbutton.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GbApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GbApiGatewayApplication.class, args);
	}

}
