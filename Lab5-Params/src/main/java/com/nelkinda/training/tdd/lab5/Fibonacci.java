package com.nelkinda.training.tdd.lab5;

public enum Fibonacci {
    ;

    static long fibonacci(final long n) {
        return n == 0 || n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
