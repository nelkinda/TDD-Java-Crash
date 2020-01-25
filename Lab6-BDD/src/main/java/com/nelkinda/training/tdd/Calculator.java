package com.nelkinda.training.tdd;

public class Calculator {
    private double value;
    public void reset() {
        value = 0;
    }

    public String getDisplay() {
        return String.format("%f", value);
    }

    public void enter(final String input) {
        for (final char c : input.toCharArray())
            enter(c);
    }

    public void enter(final char c) {
    }
}
