package com.github.fabriciolfj.reviewservice.providers.adapters;

import com.github.fabriciolfj.reviewservice.business.ProviderDataReviews;
import com.github.fabriciolfj.reviewservice.entities.Review;
import com.github.fabriciolfj.reviewservice.providers.database.converter.ReviewDataConverter;
import com.github.fabriciolfj.reviewservice.providers.database.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class FindReviewAdapterImpl implements ProviderDataReviews {

    private final ReviewRepository repository;

    @Override
    public List<Review> process(final String code) {
        return repository.findByCode(code)
                .stream().map(ReviewDataConverter::toEntity)
                .collect(Collectors.toList());
    }
}
