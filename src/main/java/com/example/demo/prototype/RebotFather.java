package com.example.demo.prototype;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

import java.awt.*;

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
