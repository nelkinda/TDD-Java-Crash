package com.nelkinda.training.tddjavacrash.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {
    @Test
    void sumOfNothing_isZero() {
        assertEquals(0, sum());
    }

    @Test
    void sumOfOne_isOne() {
        assertEquals(1, sum(1));
    }

    @Test
    void sumOfTwoNumbers() {
        assertEquals(12, sum(5, 7));
    }
}
