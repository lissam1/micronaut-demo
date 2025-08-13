package com.example.demo;

import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class BlogRepository {
    List<Release> releases = List.of( new Release("Micronaut Release 4.9.2"),
            new Release("Micronaut Release 4.9.1"),
            new Release("Micronaut Release 4.9.0"),
            new Release("Micronaut Release 4.8.10"),
            new Release("Micronaut Release 4.8.9"),
            new Release("Micronaut Release 4.8.8"),
            new Release("Micronaut Release 4.8.7"),
            new Release("Micronaut Release 4.8.6"),
            new Release("Micronaut Release 4.8.5"),
            new Release("Micronaut Release 4.8.4"),
            new Release("Micronaut Release 4.8.3"),
            new Release("Micronaut Release 4.8.2"),
            new Release("Micronaut Release 4.8.1"),
            new Release("Micronaut Release 4.8.0")
            );

    public List<Release> findAll(int max){
        return releases.subList(0,Math.min(max,releases.size()));
    }
}
