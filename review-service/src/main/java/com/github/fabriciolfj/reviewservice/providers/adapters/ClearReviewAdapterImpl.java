package com.github.fabriciolfj.reviewservice.providers.adapters;

import com.github.fabriciolfj.reviewservice.business.ProviderClearReview;
import com.github.fabriciolfj.reviewservice.providers.database.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class ClearReviewAdapterImpl implements ProviderClearReview {

    private final ReviewRepository repository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void process(final String product) {
        repository.deleteByCode(product);
    }
}
