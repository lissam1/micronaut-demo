package com.example.demo.prototype;

import com.example.demo.singleton.Rebot;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

@Singleton
public class RebotMother {

    private final com.example.demo.singleton.Rebot rebot;

    public RebotMother(com.example.demo.singleton.Rebot rebot) {
        this.rebot = rebot;
    }

    @NonNull
    public Rebot child(){
        return this.rebot;
    }
}
