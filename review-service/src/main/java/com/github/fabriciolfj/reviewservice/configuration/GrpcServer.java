package com.github.fabriciolfj.reviewservice.configuration;

import com.github.fabriciolfj.reviewservice.entrypoint.grpc.ProductReviewService;
import com.github.fabriciolfj.reviewservice.interceptor.ExceptionInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@Slf4j
public class GrpcServer {

    @Value("${grpc.server.port:9090}")
    private int port;
    private Server server;
    private ProductReviewService productReviewService;
    private ExceptionInterceptor exceptionInterceptor;

    public GrpcServer(final ProductReviewService productReviewService, ExceptionInterceptor exceptionInterceptor) {
        this.productReviewService = productReviewService;
        this.exceptionInterceptor = exceptionInterceptor;
    }

    public void start() throws IOException, InterruptedException {
        log.info("gRPC server is starting on port: {}.", port);

        server = ServerBuilder.forPort(port)
                .addService(productReviewService)
                .intercept(exceptionInterceptor)
                .build().start();

        log.info("gRPC server started and listening on port: {}.", port);
        log.info("Following service are available: ");

        server.getServices().stream()
                .forEach(s -> log.info("Service Name: {}", s.getServiceDescriptor().getName()));

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            log.info("Shutting down gRPC server.");
            GrpcServer.this.stop();
            log.info("gRPC server shut down successfully.");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public void block() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}
