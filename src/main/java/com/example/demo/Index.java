package com.example.demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.QueryValue;
import jakarta.annotation.Nullable;

import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

@Controller("/demo")
public class Index {

    private static final Logger log = Logger.getLogger(Index.class.getName());
    private static final Map<String, Object> INDEX = Collections.singletonMap("message", "Hello World!");

    @Get("/{from}/{to}")
    public String exchange(@PathVariable("from") String fromCode,
                           @PathVariable("to") String toCode) {
        return "Exchange from " + fromCode + " to " + toCode;
    }

    @Get("/source/")
    Map<String, Object> getIndex(@Nullable @QueryValue("utm_source") String source) {
        log.info("source: " + source);
        return INDEX;
    }

}
