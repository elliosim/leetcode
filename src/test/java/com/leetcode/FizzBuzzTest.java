package com.leetcode;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {



    @Test
    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.fizzBuzz(3);
        List<String> expected = Arrays.asList("1","2","Fizz");

        System.out.println(result);
        System.out.println(expected);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void fizzBuzzTest2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.fizzBuzz(5);
        List<String> expected = Arrays.asList("1","2","Fizz","4","Buzz");

        System.out.println(result);
        System.out.println(expected);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void fizzBuzzTest3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.fizzBuzz(15);
        List<String> expected = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");

        System.out.println(result);
        System.out.println(expected);

        assertArrayEquals(expected.toArray(), result.toArray());
    }
}