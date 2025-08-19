package com.example.injection.constructor;

import com.example.injection.MessageService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/constructor")
public class MessageController {

    MessageService messageService;

    MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @Get
    @Produces(MediaType.TEXT_PLAIN)
   String index() {return messageService.getMessage();}
}
