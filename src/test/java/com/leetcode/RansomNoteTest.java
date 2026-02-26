package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    RansomNote sut = new RansomNote();

    @Test
    void ransomNote() {
        String ransomNote = "a";
        String magazine = "b";
        assertFalse(sut.canConstruct(ransomNote, magazine));
    }

    @Test
    void ransomNote2() {
        String ransomNote = "aa";
        String magazine = "ab";
        assertFalse(sut.canConstruct(ransomNote, magazine));
    }

    @Test
    void ransomNote3() {
        String ransomNote = "aa";
        String magazine = "aab";
        assertTrue(sut.canConstruct(ransomNote, magazine));
    }

}