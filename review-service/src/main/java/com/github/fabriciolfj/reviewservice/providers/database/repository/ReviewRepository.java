package com.github.fabriciolfj.reviewservice.providers.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.fabriciolfj.reviewservice.providers.database.data.ReviewData;

import java.util.List;

public interface ReviewRepository extends JpaRepository<ReviewData, Long> {

    List<ReviewData> findByCode(final String code);
}
