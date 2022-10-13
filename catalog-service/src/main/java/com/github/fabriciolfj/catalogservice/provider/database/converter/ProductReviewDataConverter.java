package com.github.fabriciolfj.catalogservice.provider.database.converter;

import com.github.fabriciolfj.catalogservice.entities.Product;
import com.github.fabriciolfj.catalogservice.provider.database.data.ProductReviewData;

import java.util.List;
import java.util.stream.Collectors;

public class ProductReviewDataConverter {

    public static List<ProductReviewData> toData(final Product product) {
        return product.getReviews()
                .stream().map(r ->
                        ProductReviewData.builder()
                                .rate(r.getRate())
                                .describe(r.getMessage())
                                .code(product.getCode())
                        .build())
                .collect(Collectors.toList());
    }
}
