package com.github.fabriciolfj.reviewservice.providers.database.converter;

import com.github.fabriciolfj.reviewservice.entities.Review;
import com.github.fabriciolfj.reviewservice.providers.database.data.ReviewData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReviewDataConverter {

    private ReviewDataConverter() { }

    public static Review toEntity(final ReviewData data) {
        return Optional.ofNullable(data)
                .map(r -> new Review(r.getCode(), r.getDescribe(), r.getDateCreated(), r.getRate()))
                .orElseThrow();
    }

    public static ReviewData toData(final Review review) {
        return ReviewData
                .builder()
                .code(review.code())
                .dateCreated(review.date())
                .rate(review.rate())
                .describe(review.describe())
                .build();
    }
}
