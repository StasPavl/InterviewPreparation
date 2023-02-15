package org.example.validAnagram;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String str1 = "aba";
        String str2 = "abc";
        System.out.println(isAnagramWithASCII(str1,str2));

    }

    public static boolean isAnagramWithASCII(String str1, String str2){
        /**
         *time complexity is O(n)
         */

        if(str1.length() != str2.length()){
            return false;
        }

        int[] count = new int[128];
        //str1 = abc | str2 = abb
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;//(a)->97element -> ++ | (b) -> 98element -> ++ | (c) -> 99element -> ++
            count[str2.charAt(i)]--;//(a)->97element -> -- | (b) -> 98element -> -- | (b) -> 98element -> --
            //at the end our array will be (a) -> 0
            //                             (b) -> -1
            //                             (c) -> +1
        }
        //if my int[] have only 0 thats mean my strings is Anagram
        for (int eachElement : count) {
            if (eachElement != 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagramCodePoints(String str1, String str2){
        /**
         * time complexity O(n log n)
         */
        if(str1.length() != str2.length()){
            return false;
        }
        // codePoints Returns an IntStream of Unicode code points from this sequence
        //after boxing from IntStream to List of Integers
        List<Integer> listOfStr1 = str1.codePoints().boxed().collect(Collectors.toList());
        List<Integer> listOfStr2 = str2.codePoints().boxed().collect(Collectors.toList());
        //sorting my lists and checking their equals

        Collections.sort(listOfStr1);
        Collections.sort(listOfStr2);

        return listOfStr1.equals(listOfStr2);

    }
    public static boolean isAnagramArray(String str1 , String str2){
        /**
         * time complexity is O(n log n)
         */

        if(str1.length() != str2.length()){
            return false;
        }

        List<String> listOfStr1 = Arrays.asList(str1.split(""));
        List<String> listOfStr2 = Arrays.asList(str2.split(""));
        listOfStr2.sort(Comparator.comparing(x -> x));
        listOfStr1.sort(Comparator.comparing(x -> x));

      return listOfStr1.equals(listOfStr2);
    }
}
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or
phrase, typically using all the original letters exactly once.

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */
