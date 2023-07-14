package org.example;

public class FaktorialRecursiv {
    public static void main(String[] args) {
        int i,fact=1;
        int number =4;
        fact = factorialCalc(number);

        System.out.println("Num"+number+":"+"factorial"+fact);
    }

    public static int factorialCalc(int n){
        if(n==0){
            return 1;
        }else{
            return (n*factorialCalc(n-1));
        }


    }
}
