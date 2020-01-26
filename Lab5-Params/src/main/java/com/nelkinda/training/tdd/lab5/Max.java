package com.nelkinda.training.tdd.lab5;

public enum Max {
    ;

    public static double max(final double... numbers) {
        double maxValue = Double.NEGATIVE_INFINITY;
        for (double number : numbers)
            if (number > maxValue)
                maxValue = number;
        return maxValue;
    }
}
