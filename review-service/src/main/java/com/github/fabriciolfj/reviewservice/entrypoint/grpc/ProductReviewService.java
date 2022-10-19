package com.github.fabriciolfj.reviewservice.entrypoint.grpc;

import com.github.fabriciolfj.proto.ProductReviewRequest;
import com.github.fabriciolfj.proto.ProductReviewResponse;
import com.github.fabriciolfj.proto.ProductReviewServiceGrpc;
import com.github.fabriciolfj.reviewservice.business.usecase.FindReviews;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductReviewService extends ProductReviewServiceGrpc.ProductReviewServiceImplBase {

    private final FindReviews findReviews;

    @Override
    public void find(ProductReviewRequest request, StreamObserver<ProductReviewResponse> responseObserver) {
        var reviews = findReviews.execute(request.getCode())
                .stream().map(ProductReviewResponseConverter::toResponse)
                .collect(Collectors.toList());

        for (ProductReviewResponse review: reviews) {
            responseObserver.onNext(review);
        }

        responseObserver.onCompleted();
    }
}
