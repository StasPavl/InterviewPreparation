package org.example.theAnimalWentTwoByTwo;

import java.util.*;

public class TheAnimalWentTwoByTwo {
    public static void main(String[] args) {
        List<String> list0 = new ArrayList<>();
        List<String> list1 = new ArrayList<>(Arrays.asList("goat"));
        List<String> list2 = Arrays.asList("dog", "goat", "cat");
        List<String> list3 = Arrays.asList("dog", "cat", "dog", "cat", "beaver", "cat");
        List<String> list4 = Arrays.asList("goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan");

        System.out.println(twoByTwo(list0));
        System.out.println(twoByTwo(list1));
        System.out.println(twoByTwo(list2));
        System.out.println(twoByTwo(list3));
        System.out.println(twoByTwo(list4));
      /*  System.out.println(twoPairs(list0));
        System.out.println(twoPairs(list1));
        System.out.println(twoPairs(list2));
        System.out.println(twoPairs(list3));
        System.out.println(twoPairs(list4));*/
    }
    public static Map<String,Integer> twoPairs(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        if (list.size() <= 1){
            return map;
        }
        for (String animal : list) {
            map.put(animal, map.getOrDefault(animal, 0) + 1);
        }
        Map<String,Integer> pairs = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2){
                pairs.put(entry.getKey(), 2);
            }
        }

        return pairs;
    }
    public static Map<String,Integer> twoByTwo(List<String> list){

        Map<String,Integer> map = new HashMap<>();
        if (list.size() <= 1){
            return map;
        }
        for (String each : list) {
                if (!map.containsKey(each)) {
                    map.put(each,1);

                }else if (map.containsKey(each) && map.get(each) != 2){
                    map.put(each,map.get(each)+1);
                }
            }
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            if (entry.getValue() != 2){
                iterator.remove();
            }
        }

        return map;
    }
}
/*
Question-2 The Animals Went in Two by Two
A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs.
 We are only interested in getting one pair of each animal, and not interested in any animals where there are less than 2. They need to mate to repopulate the planet after all!
Write a function that takes a list of animals as a parameter,
which you need to check to see which animals there are at least two of,
 and then return a Map<String, Integer> that contains the name of the animal along with the fact that there are 2 of them to bring onto the ark.
Examples:
Input: [] Output: {}
Input: ['goat'] Output: {}
Input : ["dog", "goat", "dog"] Output: {dog=2}
Input : ["dog", "cat", "dog", "cat", "beaver", "cat"] Output: {cat=2, dog=2}
Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"] Output: {horse=2, rabbit=2, goat=2}
 */
