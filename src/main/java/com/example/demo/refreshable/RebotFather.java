package com.example.demo.refreshable;

import jakarta.inject.Singleton;

@Singleton
public class RebotFather {

    private final Rebot rebot;

    public RebotFather(Rebot rebot) {
        this.rebot = rebot;
    }

    public Rebot child(){
        return this.rebot;}
}
