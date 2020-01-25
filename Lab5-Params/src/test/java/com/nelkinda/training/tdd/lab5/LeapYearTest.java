package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearTest {
    @ParameterizedTest
    @ValueSource(ints = {2019, 1900})
    void testNotLeapYears(final int notLeapYear) {
        assertFalse(LeapYear.isLeapYear(notLeapYear));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000})
    void testLeapYears(final int leapYear) {
        assertTrue(LeapYear.isLeapYear(leapYear));
    }
}
