package com.github.fabriciolfj.reviewservice.business.usecase;

import com.github.fabriciolfj.reviewservice.business.ProviderDataReviews;
import com.github.fabriciolfj.reviewservice.entities.Review;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FindReviews {

    private final ProviderDataReviews providerDataReviews;

    public List<Review> execute(final String code) {
        var result = providerDataReviews.process(code);

        log.info("Size review: {} to product {}", result.size(), code);
        return result;
    }
}
