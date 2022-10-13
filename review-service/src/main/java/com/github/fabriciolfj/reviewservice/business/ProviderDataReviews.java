package com.github.fabriciolfj.reviewservice.business;

import com.github.fabriciolfj.reviewservice.entities.Review;

import java.util.List;

public interface ProviderDataReviews {

    List<Review> process(final String code);
}
