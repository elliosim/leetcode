package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    void case1() {
        int[] in = {0,1,0,3,12};
        System.out.println(Arrays.toString(in));

        MoveZeros moveZeros = new MoveZeros();
        int[] out = moveZeros.move(in);
        int[] expected = {1,3,12,0,0};

        System.out.println(Arrays.toString(out));
        assertArrayEquals(expected, out);

    }
}