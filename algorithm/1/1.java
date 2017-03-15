package com.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int mate = target - nums[i];
            if (numMap.containsKey(mate) && numMap.get(mate) != i) {
                return new int[]{i, numMap.get(mate)};
            }
        }
        return null;
    }
}
