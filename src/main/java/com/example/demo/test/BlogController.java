package com.example.demo.test;

import com.example.demo.BlogRepository;
import com.example.demo.Release;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/blog")
public class BlogController {
    private final int max;
    private final BlogRepository blogRepository;

    public BlogController(@Value("${blog.releases-per-page}") Integer max, BlogRepository blogRepository) {
        this.max = max;
        this.blogRepository = blogRepository;
    }

    @Get
    public List<Release> getReleases() {
        return blogRepository.findAll(max);
    }
}
