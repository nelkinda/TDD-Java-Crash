package com.nelkinda.training.tddjavacrash.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private final Stack stack = new Stack();

    @Test
    void newStack_isEmpty() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    void pushingOneElement() {
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
        assertEquals(5, stack.peek());
    }

    @Test
    void poppingEmptyStack_throwsException() {
        assertThrows(Stack.Underflow.class, stack::pop);
    }

    @Test
    void poppingOneElementStack_returnsThatElement() {
        stack.push(10);
        final int actual = stack.pop();
        assertEquals(10, actual);
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    void pushingTwoElements() {
        stack.push(20);
        stack.push(30);
        assertEquals(2, stack.getSize());
        assertFalse(stack.isEmpty());
        assertEquals(30, stack.peek());
    }

    @Test
    void poppingTwoElements() {
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
    }
}
