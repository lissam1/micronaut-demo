package com.example.contact;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(startApplication = false)
public class ContactBuilderTest {
    @Test
    void testBuilder() {
        var expected = new Contact("issam", "li", "Software Engineer", "MyOrg");

        assertEquals(expected, ContactBuilder.builder().firstName("issam")
        .lastName("li")
        .jobTitle("Software Engineer")
        .company("MyOrg").build());

    }

}
