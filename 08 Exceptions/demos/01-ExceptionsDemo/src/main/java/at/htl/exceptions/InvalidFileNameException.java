package at.htl.exceptions;

// Checked exception (because it doesn't extend RuntimeException)
public class InvalidFileNameException extends Exception {

    public InvalidFileNameException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
