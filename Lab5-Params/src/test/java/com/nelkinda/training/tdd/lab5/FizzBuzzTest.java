package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void one() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    void two() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    void three() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void four() {
        assertEquals("4", FizzBuzz.fizzBuzz(4));
    }

    @Test
    void five() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void six() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    void ten() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void fifteen() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void thirty() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }
}
