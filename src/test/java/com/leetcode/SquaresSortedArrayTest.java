package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresSortedArrayTest {

    @Test
    void sortedSquares() {
        SquaresSortedArray sortedSquares = new SquaresSortedArray();
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] squares = sortedSquares.sortedSquares(nums);
        assertArrayEquals(new int[]{0,1,9,16,100}, squares);
    }

}