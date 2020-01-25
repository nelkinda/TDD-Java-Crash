package com.nelkinda.training.tdd.lab5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"", "a", "mom", "noon", "racecar", "Don't nod", "I did, did I?", "Red rum, sir, is murder."})
    void testPalindrome(final String palindrome) {
        assertTrue(Palindrome.isPalindrome(palindrome));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "noun", "Just some sentence, ain't it?"})
    void testNotPalindrome(final String notPalindrome) {
        assertFalse(Palindrome.isPalindrome(notPalindrome));
    }
}
