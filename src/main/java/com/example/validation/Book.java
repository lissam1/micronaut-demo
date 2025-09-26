package com.example.validation;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Introspected
public record Book(@NotBlank String name, @Nullable String description,@Positive Integer pages) {
}
