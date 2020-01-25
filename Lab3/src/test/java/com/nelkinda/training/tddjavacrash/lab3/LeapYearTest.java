package com.nelkinda.training.tddjavacrash.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void nonLeapYears() {
        assertAll(
                () -> assertFalse(LeapYear.isLeapYear(2019)),
                () -> assertFalse(LeapYear.isLeapYear(2100))
        );
    }

    @Test
    void leapYears() {
        assertAll(
                () -> assertTrue(LeapYear.isLeapYear(2020)),
                () -> assertTrue(LeapYear.isLeapYear(2000))
        );
    }
}
