package com.example.server.filter;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.ResponseFilter;
import io.micronaut.http.annotation.ServerFilter;

@ServerFilter("/assets/bootstrap*/**")
public class CacheControlFilter {
    @ResponseFilter
    public void filterResponse(MutableHttpResponse<?> response) {
        if(!response.getHeaders().contains(HttpHeaders.CACHE_CONTROL)){
            response.getHeaders().add(HttpHeaders.CACHE_CONTROL, "public, max-age=31536000, imutable");
        }
    }
}
