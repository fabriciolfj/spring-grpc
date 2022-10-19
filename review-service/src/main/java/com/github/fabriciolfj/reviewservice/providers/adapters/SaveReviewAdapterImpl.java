package com.github.fabriciolfj.reviewservice.providers.adapters;

import com.github.fabriciolfj.reviewservice.business.ProviderPersistReview;
import com.github.fabriciolfj.reviewservice.entities.Review;
import com.github.fabriciolfj.reviewservice.exceptions.ReviewSaveException;
import com.github.fabriciolfj.reviewservice.providers.database.converter.ReviewDataConverter;
import com.github.fabriciolfj.reviewservice.providers.database.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@RequiredArgsConstructor
public class SaveReviewAdapterImpl implements ProviderPersistReview {

    private final ReviewRepository repository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void process(final Review review) {
        try {
            var data = ReviewDataConverter.toData(review);
            repository.save(data);
        } catch (Exception e) {
            log.error("Fail save review. Details: {}", e.getMessage());
            throw new ReviewSaveException();
        }

    }
}
