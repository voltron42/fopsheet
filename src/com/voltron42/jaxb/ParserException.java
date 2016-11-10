package com.voltron42.jaxb;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class ParserException extends Exception {
    public ParserException(Exception e) {
        super(e);
    }

    public ParserException(String message, Exception e) {
        super(message, e);
    }

    public ParserException(String message) {
        super(message);
    }
}
