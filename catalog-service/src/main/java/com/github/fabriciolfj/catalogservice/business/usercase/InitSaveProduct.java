package com.github.fabriciolfj.catalogservice.business.usercase;

import com.github.fabriciolfj.catalogservice.business.ProviderFindReview;
import com.github.fabriciolfj.catalogservice.business.ProviderSaveProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InitSaveProduct {

    private final ProviderFindReview findReviews;

    public void execute(final String product) {
        findReviews.process(product);
    }
}
