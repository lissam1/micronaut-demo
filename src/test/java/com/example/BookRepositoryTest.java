package com.example;

import com.example.validation.Book;
import com.example.validation.BookRepository;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@MicronautTest(startApplication = false)
public class BookRepositoryTest {

    @Test
    void bookIsValid(BookRepository bookRepository) {
        assertDoesNotThrow(() ->
                bookRepository.save(new Book("Netty in Action", null, 300))
                );

        assertThrows(ConstraintViolationException.class, () ->
                bookRepository.save(null));
    }

}
