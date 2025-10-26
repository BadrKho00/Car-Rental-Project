package ch.unil.softarch.carrental.domain.enums;


public enum PaymentStatus {
    PENDING,           // Payment is pending / not yet made
    SUCCESSFUL,        // Payment completed successfully
    FAILED,            // Payment failed
    REFUNDED,          // Payment refunded
    PARTIALLY_REFUNDED,// Partially refunded (optional)
    CANCELLED          // Order cancelled (optional)
}