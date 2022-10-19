package com.github.fabriciolfj.catalogservice.provider.database.converter;

import com.github.fabriciolfj.catalogservice.entities.Product;
import com.github.fabriciolfj.catalogservice.entities.Review;
import com.github.fabriciolfj.catalogservice.provider.database.data.ProductReviewData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductReviewDataConverter {

    public static List<ProductReviewData> toData(final Product product) {
        return product.getReviews()
                .stream().map(r ->
                        ProductReviewData.builder()
                                .rate(r.getRate())
                                .message(r.getMessage())
                                .code(product.getCode())
                                .dateCreated(r.getDate())
                        .build())
                .collect(Collectors.toList());
    }

    public static Product toEntity(final List<ProductReviewData> data, final String code) {
        var views = data.stream().map(ProductReviewDataConverter::toEntityReview).collect(Collectors.toList());

        return Product.builder()
                .code(code)
                .reviews(views)
                .build();
    }

    private static Review toEntityReview(final ProductReviewData data) {
        return Review.builder()
                .date(data.getDateCreated())
                .message(data.getMessage())
                .rate(data.getRate())
                .build();
    }
}
