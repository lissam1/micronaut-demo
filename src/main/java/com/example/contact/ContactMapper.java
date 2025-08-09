package com.example.contact;

import io.micronaut.context.annotation.Mapper;

public interface ContactMapper {
    @Mapper.Mapping(
            to = "name",
            from = "#{c.firstName} #{c.lastName()}"
            )
    ContactCard contactCardToContact(Contact c);
}
