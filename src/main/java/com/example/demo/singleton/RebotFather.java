package com.example.demo.singleton;

import jakarta.inject.Singleton;

import java.awt.*;

@Singleton
public class RebotFather {

    private final Rebot rebot;

    public RebotFather(Rebot rebot) {
        this.rebot = rebot;
    }

    public Rebot child(){
        return this.rebot;}
}
