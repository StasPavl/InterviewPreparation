package org.example.jaden_casing_string;

public class Main {
    public static void main(String[] args) {
        String str = "How can mirrors be real if our eyes aren't real";
        //System.out.println(jadenMethod(str));

        System.out.println(solution2(str));

    }


    public static String solution2 (String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                res += ""+str.charAt(i) + Character.toUpperCase(str.charAt(i+1));
                i++;

            }else{
                res += ""+str.charAt(i);
            }
        }
        return res;
    }
    private static String jadenMethod(String str) {
        String res = "";

        try {

            String[] arr = str.split(" ");

            for (String each : arr) {
                res += each.replaceFirst(each.substring(0, 1), each.substring(0, 1).toUpperCase()) + " ";

            }

        } catch (Exception e) {
            return " ";
        }

        return res.trim();
    }
}
/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing every word.
For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.


Your task is to write a method that converts strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
Note that this function should a return empty string for an empty string or null.

Example:
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"

 */
