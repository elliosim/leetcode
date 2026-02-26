package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosTest {

    @Test
    void duplicateZeros() {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] expected = {1,0,0,2,3,0,0,4};
        duplicateZeros.duplicateZeros2(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void duplicateNumsGreaterThan5() {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] arr = {4,2,8,6,2,9,4,1};
        int[] expected = {4,2,8,8,6,6,2,9};
        duplicateZeros.duplicateOver5s(arr);
        assertArrayEquals(expected, arr);
    }

}