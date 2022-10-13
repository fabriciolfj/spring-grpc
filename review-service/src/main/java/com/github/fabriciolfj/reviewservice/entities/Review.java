package com.github.fabriciolfj.reviewservice.entities;

import java.time.LocalDateTime;

public record Review(String code, String describe, LocalDateTime date){ }
