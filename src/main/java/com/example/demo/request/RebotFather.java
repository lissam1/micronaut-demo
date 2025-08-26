package com.example.demo.request;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;


@Singleton
public class RebotFather {

    private final Rebot rebot;

    public RebotFather(Rebot rebot) {
        this.rebot = rebot;
    }

    @NonNull
    public Rebot child(){
        return this.rebot;
    }
}
