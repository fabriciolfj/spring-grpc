package com.github.fabriciolfj.reviewservice.entrypoint.controller.dto;

import java.time.LocalDateTime;

public record ReviewRequest(String code, String describe, Integer rate){ }