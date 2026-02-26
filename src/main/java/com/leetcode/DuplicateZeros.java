package com.leetcode;

import java.util.Arrays;
import java.util.function.BiFunction;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        System.out.println("in: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                shiftRight(arr, i);
                i++;
            }
        }

        System.out.println("out: " + Arrays.toString(arr));

    }

    private void shiftRight(int[] arr, int i) {
        for (int j = arr.length-1; j > 0; j--) {
            if (j > i) {
                arr[j] = arr[j-1];
            }
        }
    }

    public void duplicateZeros2(int[] arr) {

        //        int[] arr = {1,0,2,3,0,4,5,0};
        //        int[] expected = {1,0,0,2,3,0,0,4};
        int zeros = 0;
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        int length = arr.length; // 8
        int i = length-1; // last index of array 7
        int j = length+zeros-1; // last index with extra zeros 10

        while (i >= 0) { // lower bounds check

            if (j < length) { // upper bounds check
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;
                if (j < length) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }

    public void duplicateOver5s(int[] arr) {
        int numsBiggerThanFive = 0;
        for (int num : arr) {
            if (num > 5) numsBiggerThanFive++;
        }

        int length = arr.length;
        int i = length-1;
        int j = length+numsBiggerThanFive-1;

        while (i >= 0) {
            if (j < length) arr[j] = arr[i];

            if (arr[i] > 5) {
                j--;
                if (j < length) arr[j] = arr[i];
            }
            i--;
            j--;
        }
    }
}


