package com.example.demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/demo")
public class Index {

    @Get("/{from}/{to}")
    public String exchange(@PathVariable("from") String fromCode,
                           @PathVariable("to") String toCode) {
        return "Exchange from " + fromCode + " to " + toCode;
    }

}
