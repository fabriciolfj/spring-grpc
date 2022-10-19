package com.github.fabriciolfj.catalogservice.provider.database.repository;

import com.github.fabriciolfj.catalogservice.provider.database.data.ProductReviewData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductReviewRepository extends JpaRepository<ProductReviewData, Long> {

    List<ProductReviewData> findByCode(final String code);
}
