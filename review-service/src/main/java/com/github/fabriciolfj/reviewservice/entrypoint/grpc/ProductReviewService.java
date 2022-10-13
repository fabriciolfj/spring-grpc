package com.github.fabriciolfj.reviewservice.entrypoint.grpc;

import com.github.fabriciolfj.proto.ProductReviewRequest;
import com.github.fabriciolfj.proto.ProductReviewResponse;
import com.github.fabriciolfj.proto.ProductReviewServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductReviewService extends ProductReviewServiceGrpc.ProductReviewServiceImplBase {

    @Override
    public void find(ProductReviewRequest request, StreamObserver<ProductReviewResponse> responseObserver) {
        super.find(request, responseObserver);
    }
}
