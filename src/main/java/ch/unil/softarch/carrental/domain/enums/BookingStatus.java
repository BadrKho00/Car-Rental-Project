package ch.unil.softarch.carrental.domain.enums;

public enum BookingStatus {
    PENDING,        // The booking has just been created, waiting for confirmation
    CONFIRMED,      // The car rental company has confirmed the booking
    PAID,           // The customer has successfully made the payment
    PICKED_UP,      // The customer has picked up the car
    IN_PROGRESS,    // The car is currently being rented
    RETURNED,       // The customer has returned the car
    COMPLETED,      // The booking is completed (including final settlement)
    CANCELLED,      // The booking has been cancelled by the customer or company
    FAILED          // The booking failed due to payment or system error
}
