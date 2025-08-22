package com.example.demo.refreshable;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

@Singleton
public class RebotMother {

    private final Rebot rebot;

    public RebotMother(Rebot rebot) {
        this.rebot = rebot;
    }

    @NonNull
    public Rebot child(){
        return this.rebot;
    }
}
