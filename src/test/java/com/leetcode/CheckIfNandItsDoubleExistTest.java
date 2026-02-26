package com.leetcode;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNandItsDoubleExistTest {

    CheckIfNandItsDoubleExist  test = new CheckIfNandItsDoubleExist();

    @Test
    void case1() {
        assertTrue(test.checkIfExist(new int[]{10, 2, 5, 3}));
        assertFalse(test.checkIfExist(new int[]{3,1,7,11}));
    }

    @Test
    void case2() throws IOException {

        Path path = Paths.get("src/test/resources/" + "nAndDoubleExistsTestData");
        List<String> lines = Files.readAllLines(path);
        for(String line : lines) {
            line = line.substring(1, line.length() - 1);

            String[] split = line.split(",");
            int[] testCase = new int[split.length];
            for(int i  = 0; i < split.length; i++) {
                testCase[i] = Integer.parseInt(split[i]);
                System.out.print(testCase[i]+",");
            }
            assertTrue(test.checkIfExist(testCase));

        }

    }



}