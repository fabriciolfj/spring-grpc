package com.github.fabriciolfj.catalogservice.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class GrpcClientRunner implements CommandLineRunner {

    @Autowired
    private GrpcClient grpcClient;

    @Override
    public void run(String... args) throws Exception {
        grpcClient.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                grpcClient.shutdown();
            } catch (Exception e) {
                log.error("Client stoped with error: {}", e.getMessage());
            }
        }));
    }
}
