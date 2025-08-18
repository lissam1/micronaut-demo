package com.example.demo;

import io.micronaut.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlogConfigurationEnvTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "BLOG_RELEASES_PER_PAGE", matches = ".*")
    void test() {
        String blogReleasesPerPageEnvironmentVariable = System.getenv("BLOG_RELEASES_PER_PAGE");
        Integer blogReleasesPerPage = Integer.parseInt(blogReleasesPerPageEnvironmentVariable);
        try (ApplicationContext ctx = ApplicationContext.run()) {
            BlogConfiguration blogConfiguration = ctx.getBean(BlogConfiguration.class);
            assertEquals(10, blogConfiguration.getReleasesPerPage());
        }
    }
}
