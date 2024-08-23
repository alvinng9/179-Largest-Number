package org.example;

import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] nums) {
        //convert the int array to a string array
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }

        //sort the new string array in a way where the combination of
        //2 numbers would produce the largest number
        Arrays.sort(strings, (a, b) -> {
            return (b + a).compareTo(a + b);
        });

        //check for the case where the int array only has 0
        if (strings[0].equals("0")) {
            return "0";
            //add all the values and return
        } else {
            StringBuilder sb = new StringBuilder();
            for (String string : strings) {
                sb.append(string);
            }
            return sb.toString();
        }
    }
}
