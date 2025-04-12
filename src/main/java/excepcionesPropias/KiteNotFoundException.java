package excepcionesPropias;

public class KiteNotFoundException extends RuntimeException {
    public KiteNotFoundException(String message) {
        super(message);
    }
}
