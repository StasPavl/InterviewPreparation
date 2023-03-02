package org.example.removeAllZeros;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12}; //1,3,12,3,12
        twoPointerMoveZero(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void twoPointerMoveZero(int[] nums){
        //0,1,0,3,12 => 1,0,0,3,12 => 1,3,0,0,12
        //^ ^        =>   ^   ^    =>     ^   ^
        int length = nums.length;
        if (length < 2 ) return;

        int left = 0, right = 1;

        while(right < length){
            if (nums[left] != 0){
                left++;
                right++;
            } else if (nums[right] == 0) {
                right++;
            }else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }

    }
    public static void moveZero(int[] nums){
        int index = 0; //3

        int length = nums.length;
        if (length < 2) return;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
