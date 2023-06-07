package org.example;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversed ="";
        for (int i = A.length()-1; i >=0 ; i--) {
            if(A.length()>0){
                reversed+=A.charAt(i);
            }
        }
        if(A.equals(reversed)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
