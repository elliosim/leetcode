package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {

    RomanToInt romanToInt = new RomanToInt();

    @Test
    void romanToInt1() {
        assertEquals(1, romanToInt.romanToInt("I"));
    }

    @Test
    void romanToInt2() {
        assertEquals(2, romanToInt.romanToInt("II"));
    }

    @Test
    void romanToInt3() {
        assertEquals(3, romanToInt.romanToInt("III"));
    }

    @Test
    void romanToInt4() {
        assertEquals(4, romanToInt.romanToInt("IV"));
    }

    @Test
    void romanToInt58() {
        assertEquals(58, romanToInt.romanToInt("LVIII"));
    }

    @Test
    void romanToInt1994() {
        assertEquals(1994, romanToInt.romanToInt("MCMXCIV"));
    }

    @Test
    void romanToInt9() {
        assertEquals(9, romanToInt.romanToInt("IX"));
    }
}