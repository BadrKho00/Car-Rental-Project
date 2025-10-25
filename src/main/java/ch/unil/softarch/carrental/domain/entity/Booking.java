package ch.unil.softarch.carrental.domain.entity;

import ch.unil.softarch.carrental.domain.enums.BookingStatus;
import ch.unil.softarch.carrental.domain.enums.PaymentStatus;

import java.util.EnumSet;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Booking {
    public UUID bookingId;
    public UUID carId;
    public UUID customerId;
    public OffsetDateTime startDate;
    public OffsetDateTime endDate;
    public BigDecimal amount;
    public BigDecimal depositAmount;
    public EnumSet<BookingStatus> bookingStatus;
    public UUID paymentId;



    public Booking(
            UUID bookingId,UUID carId, UUID customerId, OffsetDateTime startDate,
            OffsetDateTime endDate, BigDecimal amount, BigDecimal depositAmount,
            EnumSet<BookingStatus> bookingStatus, UUID paymentId) {
        this.bookingId = bookingId;
        this.carId = carId;
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.depositAmount = depositAmount;
        this.bookingStatus = bookingStatus;
        this.paymentId = paymentId;
    }
}
