package com.example.demo;

import io.micronaut.context.annotation.Property;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class BlogControllerDefaultValueTest {

    private static final @NonNull Argument<List<Release>> ARG_LIST_RELEASES = Argument.listOf(Release.class);

    @Property(name = "blog.releases-per-page", value = "10")
    @Test
    void test(@Client("/") HttpClient client) {
        BlockingHttpClient httpClient = client.toBlocking();
        HttpRequest<?> request = HttpRequest.GET("/blog");
        List<Release> releases = assertDoesNotThrow(() -> httpClient.retrieve(request, ARG_LIST_RELEASES));
        assertEquals(10, releases.size());

    }
}
