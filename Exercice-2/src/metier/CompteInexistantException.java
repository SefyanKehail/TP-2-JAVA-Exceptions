package metier;

public class CompteInexistantException extends Exception {
    public CompteInexistantException() {
    }

    public CompteInexistantException(String message) {
        super(message);
    }

    public CompteInexistantException(String message, Throwable cause) {
        super(message, cause);
    }
}
