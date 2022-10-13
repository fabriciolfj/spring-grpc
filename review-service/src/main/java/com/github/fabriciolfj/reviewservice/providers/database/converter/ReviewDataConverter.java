package com.github.fabriciolfj.reviewservice.providers.database.converter;

import com.github.fabriciolfj.reviewservice.entities.Review;
import com.github.fabriciolfj.reviewservice.providers.database.data.ReviewData;

import java.util.List;
import java.util.stream.Collectors;

public class ReviewDataConverter {

    private ReviewDataConverter() { }

    public List<Review> toEntity(final List<ReviewData> data) {
        return data
                .stream()
                .map(r -> new Review(r.getCode(), r.getDescribe(), r.getDateCreated()))
                .collect(Collectors.toList());
    }
}
