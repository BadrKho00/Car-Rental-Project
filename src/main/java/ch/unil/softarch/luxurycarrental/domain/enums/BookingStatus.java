package ch.unil.softarch.luxurycarrental.domain.enums;

public enum BookingStatus {
    PENDING,    // Booking submitted, awaiting confirmation or payment
    CONFIRMED,  // Booking confirmed
    CANCELLED,  // Booking cancelled
    COMPLETED,  // Booking completed (optional)
    EXPIRED,    // Booking expired or timed out (optional)
    REJECTED    // Booking rejected by admin (optional)
}
