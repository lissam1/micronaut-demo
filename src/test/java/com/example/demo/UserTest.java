package com.example.demo;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(startApplication = false)
public class UserTest {

    @Inject
    List<User> users;

    @Test
    void userTest(){
        User issam = new User("issam");
        issam.setEmail("issam@g.com");
        issam.setPassword("issam");
        issam.setRole(List.of("admin", "dev"));

        User s = new User("s");
        s.setEmail("s@g.com");
        s.setPassword("s");
        s.setRole(List.of("admin", "dev"));

        assertNotNull(users);
        assertFalse(users.isEmpty());
        assertEquals(2,users.size());

        assertTrue(users.stream().anyMatch(u -> u.equals(issam)));
        assertTrue(users.stream().anyMatch(u -> u.equals(s)));
    }
}
