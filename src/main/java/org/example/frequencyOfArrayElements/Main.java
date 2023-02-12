package org.example.frequencyOfArrayElements;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "apple", "Cherry", "Apple"};


    }
    private static Map<String,Long> frequencyOfArrayElementsSolutionWithStream(String[] arr){
         return Arrays.stream(arr).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

    }
    private static Map<String,Integer> frequencyOfArrayElementsSolutionWithLoop(String[] arr){
        Map<String,Integer> map = new HashMap<>();
        for (String each : arr) {
            if (map.containsKey(each)){
                map.replace(each, map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }
        return map;
    }
    private static Map<String,Integer> frequencyOfArrayElementsSolutionWithCollection(String[] arr){
        Map<String,Integer> map = new HashMap<>();
        for (String each : arr) {
            map.put(each,Collections.frequency(List.of(arr),each));
        }
        return map;
    }
}
/*
Question-4 Frequency of Array Elements
Write a function that takes a String array as parameter and returns
a map object that contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity. Order is not important.
EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}
 */
