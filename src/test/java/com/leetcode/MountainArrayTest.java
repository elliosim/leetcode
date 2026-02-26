package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainArrayTest {

    @Test
    void validMountainArray() {
        MountainArray mountainArray = new MountainArray();
        assertFalse(mountainArray.validMountainArray(new int[]{2, 1}));
        assertFalse(mountainArray.validMountainArray(new int[]{3, 5, 5}));
        assertTrue(mountainArray.validMountainArray(new int[]{0, 3, 2, 1}));
    }

}