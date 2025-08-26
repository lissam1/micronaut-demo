package com.example.demo;

import com.example.PostClient;
import com.example.PostClientImp;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest(startApplication = false)
public class PostsTest {

    private final PostClient postClient;

    public PostsTest(PostClient postClient) {
        this.postClient = postClient;
    }

    @Test
    void getPosts(PostClientImp postClient) {
        var posts = postClient.getPosts();
        assertNotNull(posts);
        assertEquals(100, posts.size());
    }

    @Test
    void getPostById() {
        var post = postClient.getPost("1");
        assertNotNull(post);
        assertEquals(1, post.id());
    }
}
