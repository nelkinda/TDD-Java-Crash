package com.nelkinda.training.tdd.lab5;

public enum FizzBuzz {
    ;

    public static String fizzBuzz(final int number) {
        if (number % 15 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return Integer.toString(number);
    }
}
