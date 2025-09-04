package com.example.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.Collections;
import java.util.Map;


@Path("/")
public class JaxRsController {

    private static final Map<String, Object> INDEX = Collections.singletonMap("message", "Hello World");

    @GET
    public Map<String, Object> index() {
        return INDEX;
    }
}
