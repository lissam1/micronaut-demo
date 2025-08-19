package com.example.injection.method;

import com.example.injection.MessageService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;

@Controller("/method")
public class MessageController {
    private  MessageService messageService;

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    String index() {return messageService.getMessage();}

    @Inject
    void populateMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
