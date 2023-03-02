package org.example.missingNumber;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        int[] nums = {3,0,1};
        int[] nums1 = {0,1};
        System.out.println(missingNumFromArr(nums));
        System.out.println(missingNumFromArr(nums1));

/*        //0,1,3 => 0,1,2,3
        int result = 0;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]){
                result = i;
                break;
            }

        }

        System.out.println(result);*/


    }
    public static int missingNumFromArr(int[] nums){
        int sumNum= 0, rangeSum = 0;// O(1)

        for (int i = 0; i < nums.length; i++) {//O(n)
            sumNum += nums[i];// 3+0+1 = 4 // 0+1
            rangeSum += i; // 0+1+2 = 3 // 0+1
        }//        1     +    2        -     1  = 2
        return (rangeSum + nums.length) - sumNum;

    }
}
/*
Input; [3,0,1}
output 2
 */
