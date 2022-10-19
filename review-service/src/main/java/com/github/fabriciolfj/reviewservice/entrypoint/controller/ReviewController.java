package com.github.fabriciolfj.reviewservice.entrypoint.controller;

import com.github.fabriciolfj.reviewservice.business.usecase.SaveReview;
import com.github.fabriciolfj.reviewservice.entrypoint.controller.dto.ReviewRequest;
import com.github.fabriciolfj.reviewservice.entrypoint.controller.mapper.ReviewRequestConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private final SaveReview saveReview;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody final ReviewRequest request) {
        log.info("Request save review receide: {}", request);
        saveReview.execute(ReviewRequestConverter.toEntity(request));
    }
}
