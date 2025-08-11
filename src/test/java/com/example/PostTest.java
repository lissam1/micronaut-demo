package com.example;

import io.micronaut.json.JsonMapper;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest(startApplication = false)
public class PostTest {

    @Test
    void deserializeFromJson(JsonMapper jsonMapper) throws IOException {
        var json = """
                {
                "userId" : 1,
                "id": 1,
                "title": "Hello World",
                "body" : "Hello World"
                }
                """;
        Post post = jsonMapper.readValue(json, Post.class);
        assertNotNull(post);
        assertEquals(1, post.userId());
        assertEquals(1, post.id());
        assertEquals("Hello World", post.title());
        assertEquals("Hello World", post.body());
    }

    @Test
    void serializeToJson(JsonMapper jsonMapper) throws IOException {
        var post = new Post(1L, 1L, "Hello World", "Hello World");
        var expected = """
                 {
                "userId" : 1,
                "id": 1,
                "title": "Hello World",
                "body" : "Hello World"
                }
                """;
        var actual = jsonMapper.writeValueAsString(post);
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.LENIENT);
    }
}
