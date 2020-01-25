package com.nelkinda.training.tdd.lab5;

public enum Palindrome {
    ;

    static boolean isPalindrome(final String candidate) {
        final String cleanedCandidate = candidate.replaceAll("\\W", "").toLowerCase();
        return cleanedCandidate.equals(new StringBuilder(cleanedCandidate).reverse().toString());
    }
}
