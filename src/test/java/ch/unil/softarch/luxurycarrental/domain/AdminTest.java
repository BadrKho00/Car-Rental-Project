package ch.unil.softarch.luxurycarrental.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import ch.unil.softarch.luxurycarrental.domain.entities.Admin;

class AdminTest {

    private Admin admin;
    private UUID adminId;

    @BeforeEach
    void setUp() {
        adminId = UUID.randomUUID();
        admin = new Admin(
                adminId,
                "adminUser",
                "password123",
                "John Doe",
                "admin@example.com"
        );
    }

    @Test
    void testGetters() {
        assertEquals(adminId, admin.getId());
        assertEquals("adminUser", admin.getUsername());
        assertEquals("password123", admin.getPassword());
        assertEquals("John Doe", admin.getName());
        assertEquals("admin@example.com", admin.getEmail());
        assertNotNull(admin.getCreatedAt());
        assertNotNull(admin.getUpdatedAt());
    }

    @Test
    void testSetters() {
        LocalDateTime now = LocalDateTime.now();
        admin.setUsername("newUser");
        admin.setPassword("newPass");
        admin.setName("Jane Doe");
        admin.setEmail("jane@example.com");
        admin.setCreatedAt(now);
        admin.setUpdatedAt(now);

        assertEquals("newUser", admin.getUsername());
        assertEquals("newPass", admin.getPassword());
        assertEquals("Jane Doe", admin.getName());
        assertEquals("jane@example.com", admin.getEmail());
        assertEquals(now, admin.getCreatedAt());
        assertEquals(now, admin.getUpdatedAt());
    }

    @Test
    void testEqualsAndHashCode() {
        Admin anotherAdmin = new Admin(adminId, "user2", "pass2", "Name2", "email2@example.com");
        assertEquals(admin, anotherAdmin);
        assertEquals(admin.hashCode(), anotherAdmin.hashCode());

        Admin differentAdmin = new Admin(UUID.randomUUID(), "user3", "pass3", "Name3", "email3@example.com");
        assertNotEquals(admin, differentAdmin);
    }

    @Test
    void testToString() {
        String str = admin.toString();
        assertTrue(str.contains(adminId.toString()));
        assertTrue(str.contains("adminUser"));
        assertTrue(str.contains("John Doe"));
        assertTrue(str.contains("admin@example.com"));
    }
}