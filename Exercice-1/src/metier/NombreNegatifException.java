package metier;

public class NombreNegatifException extends Exception {

    private int valeurErronee;

    public NombreNegatifException() {
    }

    public NombreNegatifException(int valeurErronee) {
        this.valeurErronee = valeurErronee;
    }

    public NombreNegatifException(String message) {
        super(message);
    }

    public NombreNegatifException(String message, Throwable cause) {
        super(message, cause);
    }

    public int consulterValeur() {
        return this.valeurErronee;
    }
}
