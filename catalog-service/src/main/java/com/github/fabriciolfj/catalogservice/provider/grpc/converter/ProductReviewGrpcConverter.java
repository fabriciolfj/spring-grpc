package com.github.fabriciolfj.catalogservice.provider.grpc.converter;

import com.github.fabriciolfj.catalogservice.entities.Product;
import com.github.fabriciolfj.catalogservice.entities.Review;
import com.github.fabriciolfj.proto.ProductReviewRequest;
import com.github.fabriciolfj.proto.ProductReviewResponse;

import java.time.LocalDateTime;

public class ProductReviewGrpcConverter {

    private ProductReviewGrpcConverter() {

    }

    public static ProductReviewRequest toRequest(final String product) {
        return ProductReviewRequest.newBuilder()
                .setCode(product)
                .build();
    }

    public static Product toReview(final ProductReviewResponse response) {
        var product = Product.builder()
                .code(response.getCode())
                .build();

        product.addReview(Review.builder()
                .rate(response.getRate())
                .date(LocalDateTime.parse(response.getDate()))
                .message(response.getMessage())
                .build());

        return product;
    }
}