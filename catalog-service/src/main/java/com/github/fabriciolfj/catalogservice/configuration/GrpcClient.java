package com.github.fabriciolfj.catalogservice.configuration;

import com.github.fabriciolfj.proto.ProductReviewServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
@Slf4j
public class GrpcClient {

    @Value("${grpc.server.host:localhost}")
    private String host;

    @Value("${grpc.server.port:9090}")
    private int port;

    private ManagedChannel channel;
    private ProductReviewServiceGrpc.ProductReviewServiceBlockingStub productReviewServiceStub;

    public void start() {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        productReviewServiceStub = ProductReviewServiceGrpc.newBlockingStub(channel);
        log.info("grpc client connected to {} {}", host, port);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(1, TimeUnit.MINUTES);
        log.info("grpc client disconnected sucessfully");
    }
}
