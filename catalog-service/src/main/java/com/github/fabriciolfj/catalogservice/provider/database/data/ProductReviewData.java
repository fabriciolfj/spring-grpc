package com.github.fabriciolfj.catalogservice.provider.database.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductReviewData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "describe", nullable = false)
    private String message;
    @Column(name = "code", nullable = false, unique = false)
    private String code;
    @Column(name = "rate", nullable = false)
    private Integer rate;
}
