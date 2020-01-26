package com.nelkinda.training.tdd.lab5;

import java.util.ArrayList;
import java.util.List;

public enum PrimeFactors {
    ;

    public static List<Integer> primeFactors(int number) {
        final List<Integer> primeFactors = new ArrayList<>();
        for (int factor = 2; factor <= number; factor++)
            while (number % factor == 0) {
                primeFactors.add(factor);
                number /= factor;
            }
        return primeFactors;
    }
}
