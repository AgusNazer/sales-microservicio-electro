package com.agusdev.sales;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SalesApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		System.setProperty("spring.datasource.url", dotenv.get("SPRING_DATASOURCE_URL"));
		System.setProperty("spring.datasource.username", dotenv.get("SPRING_DATASOURCE_USERNAME"));
		System.setProperty("spring.datasource.password", dotenv.get("SPRING_DATASOURCE_PASSWORD"));
		System.setProperty("spring.datasource.driver-class-name", dotenv.get("SPRING_DATASOURCE_DRIVER_CLASS_NAME"));

		// Verificar que se cargó correctamente
		System.out.println(dotenv.get("SPRING_DATASOURCE_URL"));

		SpringApplication.run(SalesApplication.class, args);
	}

}
