package com.example.demo.singleton;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.HashSet;
import java.util.Set;

@Controller("/singleton")
public class RebotController {

    private final RebotFather rebotFather;
    private final RebotMother rebotMother;

    public RebotController(RebotFather rebotFather, RebotMother rebotMother){
        this.rebotFather = rebotFather;
        this.rebotMother = rebotMother;
    }

    @Get
    Set<String> children(){
        Set<String> serilaNumbers = new HashSet<>();
        serilaNumbers.add(rebotFather.child().getSerialNumber());
        serilaNumbers.add(rebotMother.child().getSerialNumber());
        return serilaNumbers;
    }
}
