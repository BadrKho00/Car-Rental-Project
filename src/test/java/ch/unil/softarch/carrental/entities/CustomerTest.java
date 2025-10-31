package ch.unil.softarch.carrental.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;
    private UUID id;
    private LocalDate licenseExpiry;
    private LocalDateTime creationDate;

    @BeforeEach
    void setUp() {
        id = UUID.randomUUID();
        licenseExpiry = LocalDate.of(2030, 12, 31);
        creationDate = LocalDateTime.now();

        customer = new Customer(
                id,
                "John",
                "Doe",
                "john.doe@example.com",
                "+123456789",
                "D1234567",
                licenseExpiry,
                30,
                true,
                "123 Main St, City",
                500.0,
                creationDate
        );
    }

    @Test
    void testGetters() {
        assertEquals(id, customer.getId());
        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getLastName());
        assertEquals("john.doe@example.com", customer.getEmail());
        assertEquals("+123456789", customer.getPhoneNumber());
        assertEquals("D1234567", customer.getDrivingLicenseNumber());
        assertEquals(licenseExpiry, customer.getDrivingLicenseExpiryDate());
        assertEquals(30, customer.getAge());
        assertTrue(customer.isVerifiedIdentity());
        assertEquals("123 Main St, City", customer.getBillingAddress());
        assertEquals(500.0, customer.getBalance());
        assertEquals(creationDate, customer.getCreationDate());
    }

    @Test
    void testSetters() {
        customer.setFirstName("Jane");
        assertEquals("Jane", customer.getFirstName());

        customer.setBalance(1000.0);
        assertEquals(1000.0, customer.getBalance());
    }

    @Test
    void testToString() {
        String str = customer.toString();
        assertTrue(str.contains("John"));
        assertTrue(str.contains("Doe"));
        assertTrue(str.contains("D1234567"));
    }
}