package com.example;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.HttpClient;
import jakarta.inject.Singleton;

import javax.naming.ConfigurationException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Singleton
public class PostClient {

    private static final String PATH_POSTS = "/posts";
    public static final HttpRequest<?> GET_POSTS = HttpRequest.GET(PATH_POSTS);
    public static final Argument<List<Post>> ARG_LIST_POSTS = Argument.listOf(Post.class);
    public static final Argument<Post> ARG_POST = Argument.of(Post.class);
    private final BlockingHttpClient client;

    public PostClient() throws ConfigurationException {
        String uri = "https://jsonplaceholder.typicode.com/";
        try {
            this.client = HttpClient.create(new URL(uri)).toBlocking();
        } catch (MalformedURLException e){
            throw new ConfigurationException("mailformed URL" + uri);
        }
    }

    public List<Post> getPosts() {
        return client.retrieve(GET_POSTS, ARG_LIST_POSTS);
    }

    public List<Post> getPostsExchange(){
        HttpResponse<List<Post>> posts = client.exchange(GET_POSTS, ARG_LIST_POSTS);
        return posts.body();
    }

    public Post getPost(String id) {
        return client.retrieve(HttpRequest.GET( PATH_POSTS + "/" + id), ARG_POST);
    }
}
