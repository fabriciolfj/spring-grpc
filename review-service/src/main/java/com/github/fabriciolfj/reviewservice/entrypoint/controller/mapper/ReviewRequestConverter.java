package com.github.fabriciolfj.reviewservice.entrypoint.controller.mapper;

import com.github.fabriciolfj.reviewservice.entities.Review;
import com.github.fabriciolfj.reviewservice.entrypoint.controller.dto.ReviewRequest;

import java.time.LocalDateTime;

public class ReviewRequestConverter {

    public static Review toEntity(final ReviewRequest request) {
        return new Review(request.code(), request.describe(), LocalDateTime.now(), request.rate());
    }
}
