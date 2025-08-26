package com.example.demo.prototype;

import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.annotation.NonNull;

import java.util.UUID;

@Prototype
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
