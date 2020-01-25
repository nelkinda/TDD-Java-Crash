package com.nelkinda.training.tddjavacrash.lab3;

public enum Factorial {
    ;

    static long factorial(final long n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
