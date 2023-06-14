package org.example;

import java.util.Scanner;

public class LoopExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Number:");
            int num = sc.nextInt();

            if(num>0){
                System.out.println(num+" :Num is posetive");
            } else if (num<0) {
                System.out.println(num+" :Num is Negative");
            }else {
                System.out.println(num+" :Zero");
            }


        }
    }
}
