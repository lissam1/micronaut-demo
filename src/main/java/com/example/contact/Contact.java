package com.example.contact;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.sourcegen.annotations.Builder;

@Introspected
@Builder
public record Contact(
        String firstName,
        String lastName,
        String jobTitle,
        String company ) {
}
