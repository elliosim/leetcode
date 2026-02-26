package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupsTest {

    @Test
    void removeDuplicates() {
        RemoveDups removeDups = new RemoveDups();
        int[] nums = {1,1,2};

        int[] expectedNums = {1,2};
        int k = removeDups.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        assertEquals(2, k);

    }

    @Test
    void removeDuplicates2() {
        RemoveDups removeDups = new RemoveDups();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4};
        int k = removeDups.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        assertEquals(5, k);
    }

}