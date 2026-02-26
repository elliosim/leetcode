package com.leetcode;

public class NumsEvenDigits {

    public int findNumbers(int[] nums) {
        int numberOfEvenDigits = 0;
        for (int num : nums) {
            int n = 0;
            while (num > 0) {
                num /= 10;
                n++;
            }
            if (n % 2 == 0) {
                numberOfEvenDigits++;
            }
        }
        return numberOfEvenDigits;
    }

}
