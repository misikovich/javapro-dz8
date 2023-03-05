package org.example;

import java.util.Objects;

public class SumArrayParser {
    public Integer[] findTwoSums(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int num2 = nums[j];
                if (Objects.equals(num1 + num2, target)) return new Integer[] {i, j};
            }
        }
        return new Integer[] {};
    }
}
