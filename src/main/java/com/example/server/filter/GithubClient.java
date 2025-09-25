package com.example.server.filter;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

import java.util.Map;

@Client(id = "github")
public interface GithubClient {

    @Get("/users/{username}")
    Map<String, Object> userProfile(@PathVariable String username);

 }
