package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client(id = "json")
public interface PostClientImp {

    @Get("/posts")
    List<Post> getPosts();

    @Get("/posts/{id}")
    Post getPost(@PathVariable("id") String id);
}
