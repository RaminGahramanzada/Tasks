package org.example;

import java.util.Scanner;

import static java.util.Arrays.sort;


public class Anagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean equals(char[] arr1,char[] arr2){
        if (arr1.length!=arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i]!=arr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        } else {

            a = a.toLowerCase();
            b = b.toLowerCase();


            char[] charr1 = a.toCharArray();
            char[] charr2 = b.toCharArray();

            sort(charr1);
            sort(charr2);

            if (equals(charr1, charr2) == true) {

                return true;
            } else {

                return false;
            }
        }
    }
}

