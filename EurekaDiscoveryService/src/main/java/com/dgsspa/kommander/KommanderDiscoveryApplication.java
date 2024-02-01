package com.dgsspa.kommander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class KommanderDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KommanderDiscoveryApplication.class, args);
	}

}
