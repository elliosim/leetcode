package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/*

383. Ransom Note
Easy
Topics
premium lock icon
Companies
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */
public class RansomNote {


    /**
     * HashMap implementation
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char magazineLetter = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(magazineLetter, 0);
            magazineLetters.put(magazineLetter, currentCount+1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ransomNoteLetter = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(ransomNoteLetter, 0);

            if (currentCount == 0) {
                return false;
            }
            magazineLetters.put(ransomNoteLetter, currentCount-1);
        }
        return true;
    }
}
