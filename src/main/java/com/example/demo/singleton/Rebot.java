package com.example.demo.singleton;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

import java.util.UUID;

@Singleton
public class Rebot {

    @NonNull
    private final String serialNumber;

    public Rebot() {
        this.serialNumber = UUID.randomUUID().toString();
    }

    @NonNull
    public String getSerialNumber() {
        return serialNumber;
    }
}
