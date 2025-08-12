package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(startApplication = false)
public class PersonTest {

    @Test
    public void test() {
        Person person = new Person("John", 25);
        assertEquals("John", person.name());
        assertEquals(25, person.age());

        Person person2 = person.withName("Jack");
        assertEquals("Jack", person2.name());
        assertEquals(25, person2.age());

        Person person3 = person.withAge(35);
        assertEquals("John", person3.name());
        assertEquals(35, person3.age());
    }
}
