package com.example.demo;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.cookie.Cookie;

@Controller("/cookie")
public class CookieController {

    private static final String HTML_HELLO = """
            <!DOCTYPE html>
            <html>
            <head>
            </head>
            <body>
            <h1>Hello World!</h1>
            </body>
            </html>
            """;

    @Get
    @Produces(MediaType.TEXT_HTML)
    HttpResponse<String> index() {
        return HttpResponse.ok(HTML_HELLO).cookie(Cookie.of("username", "john"));
    }
 }
