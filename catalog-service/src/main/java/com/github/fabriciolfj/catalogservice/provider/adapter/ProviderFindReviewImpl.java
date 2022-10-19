package com.github.fabriciolfj.catalogservice.provider.adapter;

import com.github.fabriciolfj.catalogservice.business.ProviderFindReview;
import com.github.fabriciolfj.catalogservice.provider.grpc.GrpcFindReviews;
import com.github.fabriciolfj.catalogservice.provider.grpc.converter.ProductReviewGrpcConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProviderFindReviewImpl implements ProviderFindReview {

    private final GrpcFindReviews grpcFindReviews;

    @Override
    public void process(final String product) {
        grpcFindReviews.findReviews(ProductReviewGrpcConverter.toRequest(product));
        log.info("Requested reviews to product: {}", product);
    }
}
