package com.github.fabriciolfj.reviewservice.entrypoint.grpc;

import com.github.fabriciolfj.proto.ProductReviewResponse;
import com.github.fabriciolfj.reviewservice.entities.Review;

public class ProductReviewResponseConverter {

    private ProductReviewResponseConverter() { }

    public static ProductReviewResponse toResponse(final Review review) {
        return ProductReviewResponse.newBuilder()
                .setMessage(review.describe())
                .setDate(review.date().toString())
                .setRate(review.rate())
                .setCode(review.code())
                .build();
    }
}
