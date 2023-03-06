package org.example.remoceDuplicateFromSortedArray;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {

        int i = 0;


        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }


        int[] uniqueNums = Arrays.copyOf(nums, i + 1);

        return uniqueNums.length;
    }

}
