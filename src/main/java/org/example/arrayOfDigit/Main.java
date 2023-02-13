package org.example.arrayOfDigit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 490;
        System.out.println(Arrays.toString(arrayOfDigitSolutionWithStream(number)));


    }
    private static int[] arrayOfDigitSolutionWithStream(int number){
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
    private static int[] arrayOfDigitSolutionWithRegularLoop(int number){
        String str = Integer.toString(number);
        //convert int argument to String
        int[] result = new int[str.length()];
        //create new int array with size of String length
        for (int i = 0; i < str.length(); i++) {
            result[i] = Character.getNumericValue(str.charAt(i));
            //convert every Character tu number and added to our array
        }
        return result;
    }
    private static int[] arrayOfDigitSolutionWithWhileLoop(int number){
        int[] intArr = new int[Integer.toString(number).length()];

        int index = Integer.toString(number).length()-1;//3
        while(number > 0){
            intArr[index] = number % 10;
            number /= 10;
            index--;
        }
        return intArr;
    }
}
/*
Question-5 Array of Digits
How to convert a positive int to an array of digits.
Input: 490 Output: [4, 9, 0] (as int Array)
 */
