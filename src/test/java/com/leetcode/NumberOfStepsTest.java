package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsTest {

    @Test
    void numberOfSteps() {
        NumberOfSteps ns = new NumberOfSteps();

        int numberOfSteps = ns.numberOfSteps(14);
        System.out.println(numberOfSteps);

        assertEquals(6, numberOfSteps);
    }

    @Test
    void numberOfSteps2() {
        NumberOfSteps ns = new NumberOfSteps();

        int numberOfSteps = ns.numberOfSteps(8);
        System.out.println(numberOfSteps);

        assertEquals(4, numberOfSteps);
    }

    @Test
    void numberOfSteps3() {
        NumberOfSteps ns = new NumberOfSteps();

        int numberOfSteps = ns.numberOfSteps(123);
        System.out.println(numberOfSteps);

        assertEquals(12, numberOfSteps);
    }
}