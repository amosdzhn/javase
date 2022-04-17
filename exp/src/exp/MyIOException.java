package exp;

import java.io.IOException;

public class MyIOException extends IOException {
    public MyIOException() {
    }

    public MyIOException(String message) {
        super(message);
    }

    public MyIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyIOException(Throwable cause) {
        super(cause);
    }
}
