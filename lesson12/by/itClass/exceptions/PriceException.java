package by.itClass.exceptions;

public class PriceException extends Exception {
    private int errPrice;

    public PriceException() {
        super();
    }

    public PriceException(int errPrice) {
        this.errPrice = errPrice;
    }

    public PriceException(String message, int errPrice) {
        super(message);
        this.errPrice = errPrice;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ", errPrice=" + errPrice;
    }
}
