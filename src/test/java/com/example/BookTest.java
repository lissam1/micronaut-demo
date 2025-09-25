package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(startApplication = false)
public class BookTest {

    @Test
    public void test(Validator validator) {
        Book book = new Book("Book 1", null, 1);
        assertTrue(validator.validate(book).isEmpty());

        Book book2 = new Book("Book 2", null, -33);
        assertFalse(validator.validate(book2).isEmpty());
    }
}
