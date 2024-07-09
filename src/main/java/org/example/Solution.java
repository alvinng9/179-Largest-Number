package org.example;

import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] nums) {
        String[] result = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(result, (a, b) -> {
            return (b + a).compareTo(a + b);
        });
        if (result[0].equals("0")) {
            return "0";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String here : result) {
                sb.append(here);
            }
            return sb.toString();
        }
    }
}
