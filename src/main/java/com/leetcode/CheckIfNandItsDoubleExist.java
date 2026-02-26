package com.leetcode;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist {


    public boolean checkIfExist1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == (2 * arr[j])) {
                    return true;
                }
            }
        }

        return false;

    }

    public boolean checkIfExist(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(2 * num)) {
                return true;
            }

            if (num % 2 == 0 && set.contains(num / 2)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
