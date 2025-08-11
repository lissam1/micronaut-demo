package com.example.event;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
class Bootstrap implements ApplicationEventListener<StartupEvent> {
    private static final Logger Log = LoggerFactory.getLogger(Bootstrap.class);

    @Override
    public void onApplicationEvent(StartupEvent event) {
        Log.info("Application started. Logging from ApplicationEventListener.");
    }
}
