package org.example.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int target = 0;
       // System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(twoSumTwoPointer(nums,target)));

    }

    public static int[] twoSumTwoPointer(int[] nums,int target){
         // -3,3,4,90
        Arrays.sort(nums);

        int[] result = new int[2];

        int left = 0; //0
        int right = nums.length-1;//1

        while(left<right){
            int sum = nums[left] + nums[right];
            if (sum == target){
                break;
            }else if (sum > target){
                right--;
            }else{
                left++;
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i,nums[i]);
        }
        result[0] = map.get(left);
        result[1] = map.get(right);
        return result;
    }
    public static int[] twoSum(int[]nums, int target){
        int[] result = new int[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j]== target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }

        }
        return result;
    }
}
