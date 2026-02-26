package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumsEvenDigitsTest {

    @Test
    void case1() {
        NumsEvenDigits numsEvenDigits = new NumsEvenDigits();
        int[] nums = new int[]{12,345,2,6,7896};
        assertEquals(2, numsEvenDigits.findNumbers(nums));
    }

    @Test
    void case2() {
        NumsEvenDigits numsEvenDigits = new NumsEvenDigits();
        int[] nums = new int[]{555,901,482,1771};
        assertEquals(1, numsEvenDigits.findNumbers(nums));
    }

}