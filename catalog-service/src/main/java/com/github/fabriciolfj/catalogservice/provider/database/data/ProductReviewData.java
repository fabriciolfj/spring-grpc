package com.github.fabriciolfj.catalogservice.provider.database.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product_review")
public class ProductReviewData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "message", nullable = false)
    private String message;
    @Column(name = "code", nullable = false, unique = false)
    private String code;
    @Column(name = "rate", nullable = false)
    private Integer rate;
    @Column(name = "dateCreated", nullable = false)
    private LocalDateTime dateCreated;
}
