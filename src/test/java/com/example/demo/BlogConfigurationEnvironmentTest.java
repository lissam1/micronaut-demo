package com.example.demo;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(environments = "prod")
public class BlogConfigurationEnvironmentTest {

    @Test
    void test(BlogConfiguration blogConfiguration) {
        assertEquals(10, blogConfiguration.getReleasesPerPage());
    }
}
