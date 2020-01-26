package com.nelkinda.training.tdd.lab5;

public enum Average {
    ;

    public static double average(final double... numbers) {
        double sum = Sum.sum(numbers);
        return sum / numbers.length;
    }
}
