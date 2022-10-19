package com.github.fabriciolfj.reviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EntityScan(basePackages = "com.github.fabriciolfj.reviewservice.providers.database.data")
@EnableJpaRepositories(basePackages = "com.github.fabriciolfj.reviewservice.providers.database.repository")
@ComponentScan(basePackages = "com.github.fabriciolfj.reviewservice")
@SpringBootApplication
@EnableAsync
public class ReviewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewServiceApplication.class, args);
    }
}
