package org.example.firstUniqueChar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String str = "sss";




    }
    private static char findUniqueCharSolutionWithMap(String str){
        /**
         * time complexity is O(n)
         */
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.replace(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(' ');
    }
    private static char findUniqueCharSolutionWithLoop(String str){
        /**
         * time complexity is O(n2)
         */
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                return str.charAt(i);

            }
        }
        return ' ';
    }
}
/*
Question-3 First Unique Character
Write a function that returns the first non-repeated character from a string.
If all characters are repeated return a space character.
EXAMPLE:
Input: "success" output: u
Explanation: u and e are non-repeated, u is the first non-repeated character
 */
