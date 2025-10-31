package ch.unil.softarch.carrental.entities;

import ch.unil.softarch.carrental.enums.BookingStatus;
import ch.unil.softarch.carrental.enums.PaymentStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    private Booking booking;
    private UUID bookingId;
    private Car car;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;

    @BeforeEach
    void setUp() {
        bookingId = UUID.randomUUID();
        car = new Car(); // 可以创建一个简单Car对象或mock
        customer = new Customer(); // 可以创建一个简单Customer对象或mock
        startDate = LocalDate.of(2025, 11, 1);
        endDate = LocalDate.of(2025, 11, 5);

        booking = new Booking(
                bookingId,
                car,
                customer,
                startDate,
                endDate,
                500.0,
                100.0,
                BookingStatus.PENDING,
                PaymentStatus.SUCCESSFUL
        );
    }

    @Test
    void testGetters() {
        assertEquals(bookingId, booking.getBookingId());
        assertEquals(car, booking.getCar());
        assertEquals(customer, booking.getCustomer());
        assertEquals(startDate, booking.getStartDate());
        assertEquals(endDate, booking.getEndDate());
        assertEquals(500.0, booking.getTotalCost());
        assertEquals(100.0, booking.getDepositAmount());
        assertEquals(BookingStatus.PENDING, booking.getBookingStatus());
        assertEquals(PaymentStatus.SUCCESSFUL, booking.getPaymentStatus());
    }

    @Test
    void testSetters() {
        booking.setTotalCost(600.0);
        assertEquals(600.0, booking.getTotalCost());

        booking.setBookingStatus(BookingStatus.CONFIRMED);
        assertEquals(BookingStatus.CONFIRMED, booking.getBookingStatus());
    }

    @Test
    void testToString() {
        String str = booking.toString();
        assertTrue(str.contains(bookingId.toString()));
        assertTrue(str.contains("500.0"));
        assertTrue(str.contains("PENDING"));
    }
}