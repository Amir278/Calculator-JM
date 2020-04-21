package com.java_mentor.exceptions;

public class ExpressionException extends RuntimeException {
    public ExpressionException() {
        super();
    }

    public ExpressionException(String s) {
        super(s);
    }

    public ExpressionException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ExpressionException(Throwable throwable) {
        super(throwable);
    }
}
