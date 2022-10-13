package com.github.fabriciolfj.catalogservice.provider.database.repository;

import com.github.fabriciolfj.catalogservice.provider.database.data.ProductReviewData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewRepository extends JpaRepository<ProductReviewData, Long> {
}
