package com.example.server.filter;

import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.annotation.ClientFilter;
import io.micronaut.http.annotation.RequestFilter;

@ClientFilter(serviceId = "github") // applies to GitHub client only
public class GitHubClientFilter {

    @RequestFilter
    public void addUserAgent(MutableHttpRequest<?> request) {
        // Extract username from path (/users/{username})
        String path = request.getPath();
        String username = path.substring(path.lastIndexOf('/') + 1);

        // Add User-Agent header
        request.header("User-Agent", username);
    }
}

