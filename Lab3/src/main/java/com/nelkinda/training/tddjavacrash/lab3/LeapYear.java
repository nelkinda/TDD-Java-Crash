package com.nelkinda.training.tddjavacrash.lab3;

public enum LeapYear {
    ;

    public static boolean isLeapYear(final int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
