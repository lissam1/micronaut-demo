package com.example.event;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.scheduling.annotation.Async;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

@Singleton
class OrderEventListener implements ApplicationEventListener<OrderEvent> {
private static final Logger log = LoggerFactory.getLogger(OrderEventListener.class);

    @Override
    public void onApplicationEvent(OrderEvent event) {
        if (event.getSource() instanceof Order order) {
            processOrderEvent(order);
        }
    }

    @Async
    void processOrderEvent(Order order) {
        try {
            Thread.sleep(Duration.ofSeconds(10));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("{} Amount: {}", order.date(), order.amount());
    }
}
