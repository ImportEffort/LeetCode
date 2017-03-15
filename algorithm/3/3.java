package com.example;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lenght = 0;
        int subStart = 0, subEnd = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (; subEnd < s.length(); subEnd++) {
            if (charMap.containsKey(s.charAt(subEnd)) && charMap.get(s.charAt(subEnd)) >= subStart) {
                subStart = charMap.get(s.charAt(subEnd)) + 1;
            }
            lenght = Math.max(lenght, subEnd - subStart + 1);
            charMap.put(s.charAt(subEnd), subEnd);

        }
        return lenght;
    }
}
