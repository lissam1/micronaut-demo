package com.example.demo;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class RequestScopeTest {

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Test
    public void test(){
        String path = "/request";
        BlockingHttpClient client = httpClient.toBlocking();
        Set<String> responses = new HashSet<>(executeRequest(client, path));
        assertEquals(1, responses.size());
        responses.addAll(executeRequest(client, path));
        assertEquals(2, responses.size());
        System.out.println(responses);
    }

    private List<String> executeRequest(BlockingHttpClient client,String path ){
        return client.retrieve(createRequest(path), Argument.listOf(String.class));
    }

    private HttpRequest<?> createRequest(String path){
        return HttpRequest.GET(path).header("UUID", UUID.randomUUID().toString());
    }
}
