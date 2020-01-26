package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTest {
    @Test
    void maxOfNothingIsNegativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, Max.max());
    }

    @Test
    void maxOfOneNumberIsThatNumber() {
        assertEquals(42, Max.max(42));
    }

    @Test
    void maxOfTwoNumber() {
        assertEquals(42, Max.max(23, 42));
        assertEquals(42, Max.max(42, 23));
    }
}
