package org.example.findMaxFromIntArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,8,3,5,1,1};
        System.out.println(maxIntFromArraySolutionStream(arr));
        System.out.println(maxIntFromArraySolutionLoop(arr));

    }
    public static int maxIntFromArraySolutionStream(int[] array){
        return Arrays.stream(array).max().orElseThrow();
    }
    public static int maxIntFromArraySolutionLoop(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
/*
Question-1 Find Max from int Array
Write a function that can find the maximum number from an int Array.
input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
 */
