package com.github.fabriciolfj.catalogservice.provider.grpc;

import com.github.fabriciolfj.catalogservice.business.usercase.SaveProduct;
import com.github.fabriciolfj.catalogservice.configuration.GrpcClient;
import com.github.fabriciolfj.proto.ProductReviewRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class GrpcFindReviews {

    private final GrpcClient grpcClient;
    private final SaveProduct saveProduct;

    public void findReviews(final ProductReviewRequest request) {
        grpcClient.getSourceService().find(request, new ProductReviewObserver(saveProduct));
    }
}
