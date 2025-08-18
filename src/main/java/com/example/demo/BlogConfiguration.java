package com.example.demo;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.bind.annotation.Bindable;

@ConfigurationProperties("blog")
public interface BlogConfiguration {
    @Bindable()
    Integer getReleasesPerPage();
}
