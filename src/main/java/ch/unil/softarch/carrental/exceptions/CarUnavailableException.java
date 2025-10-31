package ch.unil.softarch.carrental.exceptions;

public class CarUnavailableException extends RuntimeException {
    public CarUnavailableException(String message) {
        super(message);
    }
}
