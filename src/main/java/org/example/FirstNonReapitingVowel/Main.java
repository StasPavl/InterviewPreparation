package org.example.FirstNonReapitingVowel;

public class Main {
    public static void main(String[] args) {
        String str = "marto";
        //System.out.println(returnVowelIndex(str));
        System.out.println(returnVowelIndexSolution2(str));

    }
    public static int returnVowelIndex(String str){
        String vowel = "aeiou";
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (vowel.contains(Character.toString(str.charAt(i)))){
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i)==str.charAt(j)){
                        count++;
                    }

                }
                if(count == 1){
                    index = i;
                    break;
                }

            }
        }
        return index;
    }


    public static int returnVowelIndexSolution2(String str){
        int index = -1;

        for (int i = 0; i < str.length(); i++) {//g o o g l e
            int count = 0;

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){

                for (int j = 0; j < str.length(); j++) {// g o o g l e
                    if (str.charAt(i)==str.charAt(j)){
                        count++;
                    }

                }
                if(count == 1){
                    index = i;
                    break;
                }

            }
        }
        return index;
    }
}
