package org.example;

import java.util.Scanner;

public class PentogonalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int input =sc.nextInt();

        pentognalFinder(input);


    }
    public static void pentognalFinder(int input){
        for (int i = 1; i < input+1; i++) {
            int pentogonalNumber =i* (3*i-1)/2;
            System.out.println(pentogonalNumber);
        }
    }
}
