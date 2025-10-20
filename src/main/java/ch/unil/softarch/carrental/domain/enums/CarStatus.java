package ch.unil.softarch.carrental.domain.enums;

public enum CarStatus {
    AVAILABLE,      // The car is available for booking
    RESERVED,       // The car has been reserved by a customer but not yet picked up
    RENTED,         // The car is currently rented out
    IN_SERVICE,     // The car is being serviced or under maintenance
    UNAVAILABLE,    // The car is temporarily unavailable (e.g. technical issue)
    RETURNED,       // The car has been returned but not yet inspected
    DECOMMISSIONED  // The car is permanently removed from the fleet
}
