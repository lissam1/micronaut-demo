package com.example.injection;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

@Singleton
public class MessageService {

    @NonNull
    public String getMessage() {
        return "Hello World!";
    }
}
