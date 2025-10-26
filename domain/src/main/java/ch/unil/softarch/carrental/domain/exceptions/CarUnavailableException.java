package ch.unil.softarch.carrental.domain.exceptions;

public class CarUnavailableException extends RuntimeException {
    public CarUnavailableException(String message) {
        super(message);
    }
}
