package com.example;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.exceptions.HttpClientException;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
public class GetPostsTest {

    @Test
    void getPostsTest(PostClient postClient) {
        var posts = postClient.getPosts();
        assertNotNull(posts);
        assertEquals(100, posts.size());
        posts = postClient.getPostsExchange();
        assertNotNull(posts);
        assertEquals(100, posts.size());
    }

    @Test
    void getPostByIdTest(PostClient postClient) {
        Post post = postClient.getPost("1");
        assertNotNull(post);
        assertEquals(1, post.id());
    }

    @Test
    void noExistingPostTest(PostClient postClient)  {
        HttpClientResponseException ex = assertThrows(HttpClientResponseException.class, () -> postClient.getPost("999"));
        assertEquals(HttpStatus.NOT_FOUND, ex.getStatus());
    }
}
