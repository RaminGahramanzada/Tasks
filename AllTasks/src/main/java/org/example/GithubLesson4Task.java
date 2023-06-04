package org.example;

import java.util.Random;
import java.util.Scanner;

public class GithubLesson4Task {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random = new Random();


        System.out.println("Welcome to find correct number game!");
        System.out.println("***********************");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("***********************");
        System.out.println("Let game begin!"+name);
        int rnd = (int) (Math.random() * (100-0)+0);



        while(true){

            System.out.println("Enter number between 0 and 100");

            int num = sc.nextInt();
            if(num>100 || num<0){
                System.out.println("Your number out of  the band");
            }

            if(num ==rnd){
                System.out.println("Congratulations,"+name+"!");
                break;

            }else if (num<rnd && num>=0) {
                System.out.println("Your number is too small. Please, try again.");

            }

            else if (num>rnd && num<=100) {
                System.out.println("Your number is too big. Please, try again");

            }
        }

    }
}
