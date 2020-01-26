package com.nelkinda.training.tdd.lab5;

public enum Sum {
    ;

    public static double sum(final double... numbers) {
        double sum = 0;
        for (final double number : numbers)
            sum += number;
        return sum;
    }
}
