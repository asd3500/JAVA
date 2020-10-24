package by.itClass.exceptions;

public class PriceException12 extends Exception {
    private int errPrice;

    public PriceException12() {
        super();
    }

    public PriceException12(int errPrice) {
        this.errPrice = errPrice;
    }

    public PriceException12(String message, int errPrice) {
        super(message);
        this.errPrice = errPrice;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ", errPrice=" + errPrice;
    }
}
