package com.github.fabriciolfj.catalogservice.entities;

import lombok.*;

import java.util.List;

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
}
