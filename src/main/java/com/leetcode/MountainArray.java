package com.leetcode;

public class MountainArray {

    // TODO current WIP - failing
    public boolean validMountainArray(int[] arr) {

        int highestPoint = 0;
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[j] || arr[j] < arr[j+1]) {
                return false;
            } else if (arr[j] < arr[j+1]) {

            }
            j++;
        }
        return false;
    }

}
