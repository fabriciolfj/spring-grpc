package com.github.fabriciolfj.reviewservice.providers.database.data;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "review")
public class ReviewData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code", nullable = false)
    private String code;
    @Column(name = "describe", nullable = false, length = 255)
    private String describe;
    @Column(name = "dateCreated", columnDefinition = "TIMESTAMP", nullable = false)
    @CreatedDate
    private LocalDateTime dateCreated;

}
