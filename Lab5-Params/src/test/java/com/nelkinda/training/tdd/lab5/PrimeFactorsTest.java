package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorsTest {
    @Test
    void primeFactorsOf1() {
        assertEquals(List.of(), PrimeFactors.primeFactors(1));
    }

    @Test
    void primeFactorsOf2() {
        assertEquals(List.of(2), PrimeFactors.primeFactors(2));
    }

    @Test
    void primeFactorsOf3() {
        assertEquals(List.of(3), PrimeFactors.primeFactors(3));
    }

    @Test
    void primeFactorsOf4() {
        assertEquals(List.of(2, 2), PrimeFactors.primeFactors(4));
    }
}
