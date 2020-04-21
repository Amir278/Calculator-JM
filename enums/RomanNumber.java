package com.java_mentor.enums;

public enum RomanNumber {
    I(1), V(5), X(10), L(50), C(100);

    private int value;
    RomanNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
