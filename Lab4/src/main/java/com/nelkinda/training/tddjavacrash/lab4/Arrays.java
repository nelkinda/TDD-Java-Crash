package com.nelkinda.training.tddjavacrash.lab4;

public enum Arrays {
    ;

    public static int[] growArray(int[] numbers) {
        final int[] newNumbers = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        return newNumbers;
    }
}
