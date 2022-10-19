package com.github.fabriciolfj.catalogservice.provider.grpc;

import com.github.fabriciolfj.catalogservice.business.usercase.SaveProduct;
import com.github.fabriciolfj.catalogservice.provider.grpc.converter.ProductReviewGrpcConverter;
import com.github.fabriciolfj.proto.ProductReviewResponse;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductReviewObserver implements StreamObserver<ProductReviewResponse> {

    private SaveProduct saveProduct;

    public ProductReviewObserver(final SaveProduct saveProduct) {
        this.saveProduct = saveProduct;
    }

    @Override
    public void onNext(final  ProductReviewResponse value) {
        log.info("Receive event: {}", value);
        saveProduct.execute(ProductReviewGrpcConverter.toReview(value));
    }

    @Override
    public void onError(Throwable t) {
        log.error("Fail receive event. Detail: {}", t.getMessage());
    }

    @Override
    public void onCompleted() {
        log.info("Stream completed");
    }
}
