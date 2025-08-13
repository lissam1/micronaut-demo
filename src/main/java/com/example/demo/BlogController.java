package com.example.demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/blog")
public class BlogController {
    private final int max;
    private final BlogRepository blogRepository;

    public BlogController(BlogConfiguration blogConfiguration, BlogRepository blogRepository) {
        this.max = blogConfiguration.getReleasesPerPage();
        this.blogRepository = blogRepository;
    }

    @Get
    public List<Release> getReleases() {
        return blogRepository.findAll(max);
    }
}
