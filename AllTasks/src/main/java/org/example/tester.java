package org.example;

public class tester {
    public static void main(String[] args) {
        int olcu = 5;
        for (int i = 0; i <=olcu ; i++) {
            for (int j = 0; j <= olcu*5-i*2-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
