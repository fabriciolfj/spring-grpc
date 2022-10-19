package com.github.fabriciolfj.reviewservice.business.usecase;

import com.github.fabriciolfj.reviewservice.business.ProviderClearReview;
import com.github.fabriciolfj.reviewservice.business.ProviderDataReviews;
import com.github.fabriciolfj.reviewservice.entities.Review;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.CompletableFuture.runAsync;

@Slf4j
@Service
@RequiredArgsConstructor
public class FindReviews {

    private final ProviderDataReviews providerDataReviews;
    private final ProviderClearReview providerClearReview;

    public List<Review> execute(final String code) {
        var result = providerDataReviews.process(code);

        log.info("Size review: {} to product {}", result.size(), code);
        executeClean(code);

        return result;
    }

    @Async("asyncExecutor")
    private void executeClean(String code) {
        runAsync(() -> providerClearReview.process(code))
                .whenComplete((r, e) -> {
                    if (e != null) {
                        log.error("Fail clear review. Details {}", e.getMessage());
                    }
                });
    }
}
