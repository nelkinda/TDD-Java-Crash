package com.nelkinda.training.tddjavacrash.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    @Test
    void fibonacciOfZeroIsOne() {
        assertEquals(1, Fibonacci.fibonacci(0));
    }

    @Test
    void fibonacciOfOneIsOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void fibonacciOfTwoIsTwo() {
        assertEquals(2, Fibonacci.fibonacci(2));
    }

    @Test
    void fibonacciOfThreeIsThree() {
        assertEquals(3, Fibonacci.fibonacci(3));
    }

    @Test
    void fibonacciOfFourIsFive() {
        assertEquals(5, Fibonacci.fibonacci(4));
    }
}
