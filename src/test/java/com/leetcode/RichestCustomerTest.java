package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerTest {

    @Test
    void maximumWealthTest() {

        RichestCustomer richestCustomer = new RichestCustomer();

        int nums[][] = {{1,2,3},{3,2,1}};

        int expected = 6;
        int result = richestCustomer.maximumWealth(nums);

        assertEquals(expected, result);
    }

    @Test
    void maximumWealthTest2() {

        RichestCustomer richestCustomer = new RichestCustomer();

        int nums[][] = {{1,5},{7,3},{3,5}};

        int expected = 10;
        int result = richestCustomer.maximumWealth(nums);

        assertEquals(expected, result);
    }
}