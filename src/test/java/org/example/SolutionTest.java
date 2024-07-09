package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestNumberTest() {
        Solution solution = new Solution();
        assertEquals("210", solution.largestNumber(new int[]{10, 2}));
        assertEquals("9534330", solution.largestNumber(new int[]{3,30,34,5,9}));
    }

}