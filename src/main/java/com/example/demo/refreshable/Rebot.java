package com.example.demo.refreshable;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.runtime.context.scope.Refreshable;

import java.util.UUID;

@Refreshable
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

