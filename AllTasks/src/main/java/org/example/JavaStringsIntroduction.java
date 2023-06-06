package org.example;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        char firstlettera = A.charAt(0);
        char firstletterUpperA = Character.toUpperCase(firstlettera);

        char firstletterb = B.charAt(0);
        char firstletterUpperB = Character.toUpperCase(firstletterb);

        String resultA = firstletterUpperA + A.substring(1);
        String resultB = firstletterUpperB + B.substring(1);

        int sira = A.compareTo(B);

        System.out.println(A.length() + B.length());

        if (sira > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(resultA + " " + resultB);
    }
}


