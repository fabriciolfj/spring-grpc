package com.github.fabriciolfj.reviewservice.business;

import com.github.fabriciolfj.reviewservice.entities.Review;

public interface ProviderPersistReview {

    void process(final Review review);
}
