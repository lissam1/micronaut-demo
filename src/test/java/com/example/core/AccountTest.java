package com.example.core;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(startApplication = false)
public class AccountTest {

    @Test
    void nameIsRequired(Validator validator) {
        assertTrue(validator.validate(new Account("1", "issam" )).isEmpty());
    }

    @Test
    void idCannotNullOrAnEmptyString(Validator validator) {
        assertFalse(validator.validate(new Account(null, "issam" )).isEmpty());
        assertFalse(validator.validate(new Account("", "issam" )).isEmpty());
    }

    @Test
    void nameCannotNullOrAnEmptyString(Validator validator) {
        assertFalse(validator.validate(new Account("1", null )).isEmpty());
        assertFalse(validator.validate(new Account("1", "" )).isEmpty());
    }
}
