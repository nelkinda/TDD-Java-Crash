package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 3",
            "4, 5",
            "5, 8",
            "6, 13"
    })
    void testFibonacci(final int n, final int expected) {
        assertEquals(expected, Fibonacci.fibonacci(n));
    }
}
