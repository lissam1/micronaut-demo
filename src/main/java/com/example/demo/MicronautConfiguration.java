package com.example.demo;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Context;
import jakarta.validation.constraints.Pattern;

@Context
@ConfigurationProperties("micronaut")
public class MicronautConfiguration {

    @Pattern(regexp = "java|groovy|kotlin")
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
