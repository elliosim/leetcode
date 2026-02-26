package com.leetcode;

import java.util.HashMap;

public class RomanToInt {

    HashMap<Character, Integer> romanMap = new HashMap<>();

    RomanToInt() {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int romanToInt(String s) {

        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = romanMap.get(s.charAt(i));

            if (i < s.length()-1 && cur < romanMap.get(s.charAt(i + 1))) {
                result -= cur;
            } else {
                result += cur;
            }
        }

        return result;
    }
}
