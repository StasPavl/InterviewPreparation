package org.example.countNumOfDuplicateChar;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "aA111b";

        System.out.println(countDuplicate2(str));
       // System.out.println(countDuplicate(str));

    }
    private static Integer countDuplicate2(String str){

        str = str.toLowerCase();

        int count =0;

        Map<Character,Integer> myMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!myMap.containsKey(str.charAt(i))){
                myMap.put(str.charAt(i),1);
            }else{
                myMap.replace(str.charAt(i), myMap.get(str.charAt(i)),myMap.get(str.charAt(i))+1);
            }

        }

        for (Map.Entry<Character, Integer> eachEntry : myMap.entrySet()) {
            if (eachEntry.getValue() > 1){
                count++;
            }
        }

        return count;

    }

    private static Integer countDuplicate(String str){

        String collection = "";//AB

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) { //ABBA
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                    if (!collection.contains(""+str.charAt(i)) && count != 1){
                        collection += ""+str.charAt(i);
                    }
                }
            }
        }


        return collection.length();
    }
}
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.
 */
