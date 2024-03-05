package metier;

public class FondsInsuffisantsException extends Exception {
    public FondsInsuffisantsException() {
    }

    public FondsInsuffisantsException(String message) {
        super(message);
    }

    public FondsInsuffisantsException(String message, Throwable cause) {
        super(message, cause);
    }
}
