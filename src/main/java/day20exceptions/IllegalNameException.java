package day20exceptions;

import java.io.IOException;

public class IllegalNameException extends IOException {
    public IllegalNameException(String message) {
        super(message);
    }
}
