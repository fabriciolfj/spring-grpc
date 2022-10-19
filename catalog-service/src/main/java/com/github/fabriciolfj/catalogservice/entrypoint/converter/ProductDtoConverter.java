package com.github.fabriciolfj.catalogservice.entrypoint.converter;

import com.github.fabriciolfj.catalogservice.entities.Product;
import com.github.fabriciolfj.catalogservice.entities.Review;
import com.github.fabriciolfj.catalogservice.entrypoint.dto.ProductRequest;
import com.github.fabriciolfj.catalogservice.entrypoint.dto.ProductResponse;
import com.github.fabriciolfj.catalogservice.entrypoint.dto.ReviewResponse;

import java.util.stream.Collectors;

public class ProductDtoConverter {

    private ProductDtoConverter() { }

    public static ProductResponse toResponse(final Product product) {
        return ProductResponse.builder()
                .code(product.getCode())
                .reviews(product.getReviews().stream()
                        .map(ProductDtoConverter::toResponseReview)
                        .collect(Collectors.toList()))
                .build();
    }

    private static ReviewResponse toResponseReview(final Review review) {
        return ReviewResponse.builder()
                .date(review.getDate())
                .message(review.getMessage())
                .rate(review.getRate())
                .build();
    }
}
