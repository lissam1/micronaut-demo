package com.example.validation;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Controller("/books")
public class BookController {

    @Post("/save")
    @Status(HttpStatus.CREATED)
    void add(@NotNull @Valid @Body Book book) {}

}
