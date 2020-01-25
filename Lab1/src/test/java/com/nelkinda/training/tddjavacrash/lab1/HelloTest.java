package com.nelkinda.training.tddjavacrash.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.String.format;
import static java.nio.charset.Charset.defaultCharset;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    private static final PrintStream originalStdout = System.out;
    private ByteArrayOutputStream interceptedStdout;

    @BeforeEach
    void interceptStdout() {
        interceptedStdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(interceptedStdout));
    }

    @AfterEach
    void restoreStdout() {
        System.setOut(originalStdout);
    }

    @Test
    void testHello() {
        Hello.main();
        final String expected = format("Hello, world!%n");
        final String actual = interceptedStdout.toString(defaultCharset());
        assertEquals(expected, actual);
    }
}
