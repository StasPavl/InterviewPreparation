package org.example.revorseInteger;

public class main {
    public static void main(String[] args) {
        int i = 1534236469;
        System.out.println(reverse(i));



    }
    public static int reverse(int input){
        long reversed = 0;
        while(input !=0){
            reversed = reversed *10 + input % 10;
            input /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)reversed;
    }
}
