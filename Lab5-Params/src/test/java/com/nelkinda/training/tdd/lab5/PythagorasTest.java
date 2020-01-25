package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PythagorasTest {
    @ParameterizedTest
    @CsvFileSource(
            resources = "pythagoras-test-data.csv",
            numLinesToSkip = 1
    )
    void testPythagoras(final double a, final double b, final double expectedC) {
        assertEquals(expectedC, Pythagoras.pythagoras(a, b));
    }
}
