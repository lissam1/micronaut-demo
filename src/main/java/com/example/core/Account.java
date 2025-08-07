package com.example.core;

import io.micronaut.core.annotation.Introspected;
import jakarta.validation.constraints.NotBlank;

@Introspected
public record Account(@NotBlank String id, @NotBlank String name) {
}
