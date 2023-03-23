package org.example.excelSheetColumnNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(titleToNumber("BCD"));

    }
    public static int titleToNumber(String columnTitle){
        int result = 0;
        //going through all chars in my string
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
           int columnNum = c -'A' + 1; // checking what is number of my char (1-26)
           result = result * 26 + columnNum;
        }
        return result;
    }
}
