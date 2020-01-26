package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {
    @Test
    void sumOfNothingIsZero() {
        assertEquals(0, Sum.sum());
    }

    @Test
    void sumOfSingleNumberIsThatNumber() {
        assertEquals(42, Sum.sum(42));
    }

    @Test
    void sumOfTwoNumbers() {
        assertEquals(65, Sum.sum(23, 42));
    }
}
