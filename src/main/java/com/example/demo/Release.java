package com.example.demo;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record Release(String title) {
}
