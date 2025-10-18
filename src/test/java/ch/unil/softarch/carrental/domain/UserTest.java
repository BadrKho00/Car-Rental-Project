package ch.unil.softarch.carrental.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User spiderman;

    @BeforeEach
    void setup() {
        spiderman = new User();
    }

    @Test
    void testReplace() {
        var ironman = new User(UUID.randomUUID(), "ironman", "fsfs", "Tony", "Stark", "iron@starkcorp.com", "+41 12345678");
        spiderman.setFirstName("Peter");
        spiderman.setLastName("Parker");
        spiderman.setUsername("spiderman");
        spiderman.setEmail("spidey@web.com");
        spiderman.replaceWith(ironman);
        assertEquals(ironman, spiderman);
    }
}
