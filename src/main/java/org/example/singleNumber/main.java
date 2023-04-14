package org.example.singleNumber;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class main {
    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        int[] nums1 = {2,2,1};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));
        System.out.println(singleNumber3(nums));
        System.out.println(singleNumber4(nums));
        System.out.println("---------");
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber2(nums1));
        System.out.println(singleNumber3(nums1));
        System.out.println(singleNumber4(nums1));

    }
    public static int singleNumber4(int[] nums){//time O(n) space O(n)
        Set<Integer> uniq = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for (int num : nums) {
            if (uniq.contains(num)){
                uniq.remove(num);
                dup.add(num);
            }else{
                uniq.add(num);
            }
        }
        for (int num : nums) {
            if (!dup.contains(num)){
                return num;
            }
        }
        return nums[0];
    }
    public static int singleNumber3(int[]nums){//time O(n) space O(1)
        int result = 0;
        for (int num : nums) {
            result = result ^ num; //4,1,2,1,2
        }
        return result;
/*
how XOR is working
-----------
result = 0
---------------
result ^= 4  // result = 4

                    4+1
result ^= 1  // result = 5

                    5+2
result ^= 2  // result = 7

             dup -> 7-1
result ^= 1  // result = 6

             dup -> 6-2
result ^= 2  // result = 4 (final result)

 */
    }
    public static int singleNumber2(int[]nums){//time O(n) space O(n)
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue()==1){
                return integerIntegerEntry.getKey();
            }
        }
        return nums[0];
    }
    public static int singleNumber(int[]nums){//space O(1) time O(n2)
        for (int i = 0; i < nums.length; i++) {
            int count =0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count==1){
                return nums[i];
            }
        }
        return nums[0];
    }
}

/*

time complexity O(N)
space complexity O(1)
Week-11 Algo Questions
Question-1 Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1:
Input: nums = [2,2,1]
Output: 1

Example 3:
Input: nums = [1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Constraints:
1 <= nums.length <= 3 * 104
-3*104 <=nums[i]<=3*104
Each element in the array appears twice except for one element which appears only once.
with time complexity O(N)
and space complexity O(1)

 */
