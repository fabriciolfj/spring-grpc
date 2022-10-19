package com.github.fabriciolfj.catalogservice.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product {

    @EqualsAndHashCode.Include
    private String code;
    private List<Review> reviews;

    public boolean isProductValid() {
        return !reviews.isEmpty();
    }

    public Product addReview(final Review review) {
        if (this.reviews == null) {
            this.reviews = new ArrayList<>();
        }

        this.reviews.add(review);
        return this;
    }
}
