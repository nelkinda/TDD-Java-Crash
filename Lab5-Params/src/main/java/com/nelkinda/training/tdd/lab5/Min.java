package com.nelkinda.training.tdd.lab5;

public enum Min {
    ;

    public static double min(final double... numbers) {
        double minValue = Double.POSITIVE_INFINITY;
        for (final double number : numbers)
            if (number < minValue)
                minValue = number;
        return minValue;
    }
}
