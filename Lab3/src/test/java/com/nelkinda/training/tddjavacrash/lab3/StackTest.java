package com.nelkinda.training.tddjavacrash.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void test() {
        final Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
        assertEquals(5, stack.peek());
        stack.push(10);
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.getSize());
        assertEquals(10, stack.peek());
        assertEquals(10, stack.pop());
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }
}
