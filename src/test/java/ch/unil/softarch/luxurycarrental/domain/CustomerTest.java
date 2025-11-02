package ch.unil.softarch.luxurycarrental.domain;

import ch.unil.softarch.luxurycarrental.domain.entities.Customer;
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

        customer = new Customer();
        customer.setId(id);
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setEmail("john.doe@example.com");
        customer.setPhoneNumber("+123456789");
        customer.setDrivingLicenseNumber("D1234567");
        customer.setDrivingLicenseExpiryDate(licenseExpiry);
        customer.setAge(30);
        customer.setVerifiedIdentity(true);
        customer.setBillingAddress("123 Main St, City");
        customer.setBalance(500.0);
        customer.setCreationDate(creationDate);
        customer.setPassword("securePassword123");
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
        assertEquals("securePassword123", customer.getPassword());
    }

    @Test
    void testAllArgsConstructor() {
        UUID id = UUID.randomUUID();
        LocalDate licenseExpiry = LocalDate.of(2030, 12, 31);
        LocalDateTime creationDate = LocalDateTime.now();

        Customer customer = new Customer(
                id,
                "John",
                "Doe",
                "john.doe@example.com",
                "securePassword123",
                "+123456789",
                "D1234567",
                licenseExpiry,
                30,
                true,
                "123 Main St, City",
                500.0,
                creationDate
        );

        assertEquals(id, customer.getId());
        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getLastName());
        assertEquals("john.doe@example.com", customer.getEmail());
        assertEquals("securePassword123", customer.getPassword());
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
        customer.setLastName("Smith");
        customer.setEmail("jane.smith@example.com");
        customer.setPhoneNumber("+987654321");
        customer.setDrivingLicenseNumber("D7654321");
        customer.setDrivingLicenseExpiryDate(LocalDate.of(2031, 1, 1));
        customer.setAge(35);
        customer.setVerifiedIdentity(false);
        customer.setBillingAddress("456 Another St, City");
        customer.setBalance(1000.0);
        customer.setCreationDate(LocalDateTime.now());
        customer.setPassword("newPassword456");

        assertEquals("Jane", customer.getFirstName());
        assertEquals("Smith", customer.getLastName());
        assertEquals("jane.smith@example.com", customer.getEmail());
        assertEquals("+987654321", customer.getPhoneNumber());
        assertEquals("D7654321", customer.getDrivingLicenseNumber());
        assertEquals(LocalDate.of(2031, 1, 1), customer.getDrivingLicenseExpiryDate());
        assertEquals(35, customer.getAge());
        assertFalse(customer.isVerifiedIdentity());
        assertEquals("456 Another St, City", customer.getBillingAddress());
        assertEquals(1000.0, customer.getBalance());
        assertNotNull(customer.getCreationDate());
        assertEquals("newPassword456", customer.getPassword());
    }

    @Test
    void testToString() {
        String str = customer.toString();
        assertTrue(str.contains("John"));
        assertTrue(str.contains("Doe"));
        assertTrue(str.contains("D1234567"));
        assertTrue(str.contains("securePassword123"));
    }
}