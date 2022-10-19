package com.github.fabriciolfj.reviewservice.business.usecase;

import com.github.fabriciolfj.reviewservice.business.ProviderPersistReview;
import com.github.fabriciolfj.reviewservice.entities.Review;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SaveReview {

    private final ProviderPersistReview provider;

    public void execute(final Review review) {
        provider.process(review);
        log.info("Save review: {}", review);
    }
}
