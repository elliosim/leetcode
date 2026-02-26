package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    private MergeSortedArray2 ms = new MergeSortedArray2();

    @Test
    void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        ms.merge(nums1,3,nums2,3);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        assertArrayEquals(new int[]{1,2,2,3,5,6},nums1);
    }

    @Test
    void merge2() {
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int[] nums2 = {1,2,2};
        ms.merge(nums1,6,nums2,3);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        assertArrayEquals(new int[]{-1,0,0,1,2,2,3,3,3},nums1);


    }
}