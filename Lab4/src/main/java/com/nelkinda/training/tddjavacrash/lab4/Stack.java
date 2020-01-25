package com.nelkinda.training.tddjavacrash.lab4;

public class Stack {
    private int size;
    private int[] numbers = new int[0];

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void push(int i) {
        grow();
        numbers[size++] = i;
    }

    private void grow() {
        numbers = Arrays.growArray(numbers);
    }

    public int peek() {
        return numbers[size - 1];
    }

    public int pop() {
        if (size == 0)
            throw new Underflow();
        return numbers[--size];
    }

    public static class Underflow extends RuntimeException {
    }
}
