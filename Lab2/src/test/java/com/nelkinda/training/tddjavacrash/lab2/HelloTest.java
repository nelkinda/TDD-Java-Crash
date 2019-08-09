package com.nelkinda.training.tddjavacrash.lab2;

// TODO: Add Import for @Test
// TODO: Add Import for assertEquals

class HelloTest {
    @Test
    void testHello() {
        final String expected = "Hello, world!";
        final String actual = Hello.getMessage();
        assertEquals(expected, actual);
    }
}
