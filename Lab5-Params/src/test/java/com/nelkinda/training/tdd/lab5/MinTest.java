package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinTest {
    @Test
    void minOfNothingIsInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, Min.min());
    }

    @Test
    void minOfOneNumberIsThatNumber() {
        assertEquals(42, Min.min(42));
    }

    @Test
    void maxOfTwoNumber() {
        assertEquals(23, Min.min(23, 42));
        assertEquals(23, Min.min(42, 23));
    }
}
