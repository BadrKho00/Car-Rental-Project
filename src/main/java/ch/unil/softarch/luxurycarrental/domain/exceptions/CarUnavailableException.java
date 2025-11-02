package ch.unil.softarch.luxurycarrental.domain.exceptions;

public class CarUnavailableException extends RuntimeException {
    public CarUnavailableException(String message) {
        super(message);
    }
}
