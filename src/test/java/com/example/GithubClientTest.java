package com.example;

import com.example.server.filter.GithubClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(startApplication = false)
public class GithubClientTest {

    @Test
    void profile(GithubClient githubClient) {
        Map<String, Object> profile = githubClient.userProfile("lissam1");
        assertEquals("https://github.com/lissam1", profile.get("html_url"));
    }
}
