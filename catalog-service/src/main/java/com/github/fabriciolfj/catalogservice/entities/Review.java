package com.github.fabriciolfj.catalogservice.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Review {

    private String message;
    private Integer rate;
    private LocalDateTime date;
}
