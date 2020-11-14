package by.itClass.exceptions;

public class TxtLineException extends Exception {
    private String errorLine;

    public TxtLineException() {
        super();
    }

    public TxtLineException(Throwable cause) {
        super(cause);
    }

    public TxtLineException( String errorLine, Throwable cause) {
        super(cause);
        this.errorLine = errorLine;
    }

    public String getErrorLine() {
        return errorLine;
    }
}
