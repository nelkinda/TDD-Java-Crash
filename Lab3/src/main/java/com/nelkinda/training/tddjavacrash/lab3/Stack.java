package com.nelkinda.training.tddjavacrash.lab3;

public class Stack {
    private int[] data = new int[0];
    private int size;
    public Stack() {}
    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public void push(final int number) {
        if (data.length == size)
            grow();
        data[size++] = number;
    }
    public int pop() {
        if (size == 0)
            throw new Underflow();
        return data[--size];
    }
    public int peek() {
        if (size == 0)
            throw new Underflow();
        return data[size - 1];
    }

    private void grow() {
        final int[] oldData = data;
        final int[] newData = new int[(int) (oldData.length * 1.5 + 1)];
        System.arraycopy(oldData, 0, newData, 0, oldData.length);
        data = newData;
    }

    public static class Underflow extends RuntimeException {
    }
}
