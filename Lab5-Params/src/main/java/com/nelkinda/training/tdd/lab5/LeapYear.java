package com.nelkinda.training.tdd.lab5;

public enum LeapYear {
    ;

    public static boolean isLeapYear(final int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
