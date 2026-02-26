package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    /*
    [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
     */

    @Test
    public void testCase1() {
        RemoveElement test = new RemoveElement();

        int[] nums = {3,2,2,3};
        int val = 3;

        System.out.println(Arrays.toString(nums));
        assertEquals(2, test.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void testCase2() {
        RemoveElement test = new RemoveElement();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(Arrays.toString(nums));
        int actual = test.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        assertEquals(5, actual);
        //0,1,4,0,3,_,_,_
    }
}