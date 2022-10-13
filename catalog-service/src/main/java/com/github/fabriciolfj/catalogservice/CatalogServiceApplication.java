package com.github.fabriciolfj.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@EntityScan(basePackages = "com.github.fabriciolfj.catalogservice.provider.database.data")
@EnableJpaRepositories(basePackages = "com.github.fabriciolfj.catalogservice.provider.database.repository")
@ComponentScan(basePackages = "com.github.fabriciolfj.catalogservice")
@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

}
