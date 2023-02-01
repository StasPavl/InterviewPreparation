package org.example;

import org.example.animalFeast.main;

public class test {
    public boolean test(String str){
        if(str.equals("123")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.test("123");

        check("123");


    }
    public static boolean check(String str){
        if (str.equals("123")){
            return true;
        }
        return false;
    }
}
