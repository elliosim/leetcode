package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    @Test
    void maxConsecutiveOnes() {

        MaxConsecutiveOnes maxOnes = new MaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        assertEquals(3, maxOnes.findMaxConsecutiveOnes(nums));
    }

}