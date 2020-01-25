package com.nelkinda.training.tddjavacrash.lab3;

public enum Fibonacci {
    ;

    static long fibonacci(final long n) {
        if (n < 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
