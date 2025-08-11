package com.example;

import com.example.event.OracleWebsite;
import com.example.event.OracleWebsiteBuilder;
import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.event.BeanCreatedEvent;
import io.micronaut.context.event.BeanCreatedEventListener;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Property(name = "spec.name", value = "OracleWebsiteTest")
@MicronautTest(startApplication = false)
class OracleWebsiteTest {
    @Test
    void builderInCombinationWithBeanCreatedListener(OracleWebsite oracleWebsite) {
        assertEquals("https://www.oracle.com/ma/", oracleWebsite.toString());
    }

    @Property(name = "spec.name", value = "OracleWebsiteTest")
    @Singleton
    static class OracleWebsiteBuilderBeanCreatedListener implements BeanCreatedEventListener<OracleWebsiteBuilder> {

        @Override
        public OracleWebsiteBuilder onCreated(@NonNull BeanCreatedEvent<OracleWebsiteBuilder> event) {
            OracleWebsiteBuilder builder = event.getBean();
            builder.region("ma");
            return builder;
        }

    }
}
