package com.example.contact;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest(startApplication = false)
public class ContactBeanMapper {

    @Test
    void ContactMapperTest(ContactMapper contactMapper) {
        var expected = new ContactCard("Issam Liqali", "MyOrg");
        var contact = new Contact("Issam", "Liqali", "Research Assistant", "MyOrg");
        var result = contactMapper.contactCardToContact(contact);
        Assertions.assertEquals(result, expected);
    }
}
