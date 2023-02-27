package org.example.validPalidrom;

public class VP {
    public static void main(String[] args) {
//                    0
        String str = "0P";
        System.out.println(isPalidrome(str));

    }
    private static boolean isPalidrome(String str){
        str = str.toLowerCase().replaceAll("[^a-z0-9]","");
        int n =str.length();
        int i =0, j = n-1;

        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
