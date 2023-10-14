package exception;

public class OperatorNotFoundException extends Exception{
    public OperatorNotFoundException() {
    }

    public OperatorNotFoundException(String message) {
        super(message);
    }
}
