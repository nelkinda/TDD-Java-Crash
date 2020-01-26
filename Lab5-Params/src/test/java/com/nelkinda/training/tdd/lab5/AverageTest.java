package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageTest {
    @Test
    void averageOfNothingIsZero() {
        assertEquals(Double.NaN, Average.average());
    }

    @Test
    void averageOfSingleNumberIsThatNumber() {
        assertEquals(42, Average.average(42));
    }

    @Test
    void averageOfTwoNumbers() {
        assertEquals(20, Average.average(10, 30));
    }

    @Test
    void averageOfMirrorNumbersIsZero() {
        assertEquals(0, Average.average(42, -42, 23, -23));
    }
}
