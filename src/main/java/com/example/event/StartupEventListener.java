package com.example.event;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
class StartupEventListener {
    private static final Logger LOG = LoggerFactory.getLogger(StartupEventListener.class);

    @EventListener
    void onStartup(StartupEvent event) {
        LOG.info("Application started. Logging from StartupEventListener.");
    }
}
