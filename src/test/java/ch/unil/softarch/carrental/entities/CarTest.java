package ch.unil.softarch.carrental.entities;


import ch.unil.softarch.carrental.enums.CarStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
import ch.unil.softarch.carrental.enums.*;

class CarTest {

    private Car car;
    private CarType carType;

    @BeforeEach
    void setUp() {
        // Create a sample CarType
        carType = new CarType();
        carType.setBrand("Tesla");
        carType.setModel("Model S");
        carType.setSeats(5);

        // Create a sample Car
        car = new Car();
        car.setId(UUID.randomUUID());
        car.setLicensePlate("ABC-1234");
        car.setCarType(carType);
        car.setDailyRentalPrice(100.0);
        car.setDepositAmount(500.0);
        car.setStatus(CarStatus.AVAILABLE);
        car.setImageUrl("https://example.com/car.jpg");
        car.setRegistrationDate(LocalDate.of(2022, 1, 10));
        car.setLastMaintenanceDate(LocalDate.of(2023, 5, 15));
        car.setVin("1HGCM82633A004352");
        car.setColor("Red");
        car.setInsuranceExpiryDate(LocalDate.of(2024, 1, 10));
    }

    @Test
    void testCarConstructorAndGetters() {
        assertNotNull(car.getId());
        assertEquals("ABC-1234", car.getLicensePlate());
        assertEquals(carType, car.getCarType());
        assertEquals(100.0, car.getDailyRentalPrice());
        assertEquals(500.0, car.getDepositAmount());
        assertEquals(CarStatus.AVAILABLE, car.getStatus());
        assertEquals("https://example.com/car.jpg", car.getImageUrl());
        assertEquals(LocalDate.of(2022, 1, 10), car.getRegistrationDate());
        assertEquals(LocalDate.of(2023, 5, 15), car.getLastMaintenanceDate());
        assertEquals("1HGCM82633A004352", car.getVin());
        assertEquals("Red", car.getColor());
        assertEquals(LocalDate.of(2024, 1, 10), car.getInsuranceExpiryDate());
    }

    @Test
    void testCarStatusChange() {
        car.setStatus(CarStatus.AVAILABLE);
        assertEquals(CarStatus.AVAILABLE, car.getStatus());

        car.setStatus(CarStatus.UNAVAILABLE);
        assertEquals(CarStatus.UNAVAILABLE, car.getStatus());
    }

    @Test
    void testLicensePlateUpdate() {
        car.setLicensePlate("XYZ-5678");
        assertEquals("XYZ-5678", car.getLicensePlate());
    }

}