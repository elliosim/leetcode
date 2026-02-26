package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumTest {

    private final RunningSum runningSum = new RunningSum();

    @Test
    public void testCase() {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        int[] result = runningSum.runningSum(nums);
        System.out.println(Arrays.toString(result));
        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, result);
    }


    @Test
    public void testCase2() {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(nums));
        int[] result = runningSum.runningSum(nums);
        System.out.println(Arrays.toString(result));
        int[] expected = {1,2,3,4,5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase3() {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(nums));
        int[] result = runningSum.runningSum(nums);
        System.out.println(Arrays.toString(result));
        int[] expected = {3,4,6,16,17};
        assertArrayEquals(expected, result);
    }


}