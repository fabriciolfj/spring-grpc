package com.github.fabriciolfj.catalogservice.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class ErrorMessage {

    private String messsage;
    private int status;
}
