package com.java_mentor.enums;

public enum Operation {
    ADD("+") {
        @Override
        public int count(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        @Override
        public int count(int a, int b) {
            return a - b;
        }
    },
    DIVIDE("/") {
        @Override
        public int count(int a, int b) {
            return a / b;
        }
    },
    MULTIPLY("*") {
        @Override
        public int count(int a, int b) {
            return a * b;
        }
    };

    private String value;
    Operation(String value) {
        this.value = value;
    }
    public abstract int count(int a, int b);

    public static Operation getInstance(String value) {
        Operation[] operations = Operation.values();
        for(Operation operation : operations) {
            if(operation.value.equals(value)) {
                return operation;
            }
        }
        throw new IllegalArgumentException("Wrong operation: " + value);
    }
}
