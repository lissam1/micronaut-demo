package com.example.event;

import io.micronaut.context.event.ApplicationEventPublisher;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Controller("order")
class OrderController {
    private ApplicationEventPublisher<OrderEvent> eventPublisher;

    OrderController(ApplicationEventPublisher<OrderEvent> eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Post
    @Status(HttpStatus.CREATED)
    void save() {
        Order order = new Order(new BigDecimal(100), LocalDateTime.now());
        OrderEvent event = new OrderEvent(order);
        eventPublisher.publishEvent(event);
    }
}
