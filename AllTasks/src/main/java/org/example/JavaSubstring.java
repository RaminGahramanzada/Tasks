package org.example;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();


        String cutter =S.substring(start, end);

        System.out.println(cutter);



    }

}
