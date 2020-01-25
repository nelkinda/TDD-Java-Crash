package com.nelkinda.training.tddjavacrash.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    void factorialOfZeroIsOne() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void factorialOfOneIsOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void factorialOfTwoIsTwo() {
        assertEquals(2, Factorial.factorial(2));
    }
}
