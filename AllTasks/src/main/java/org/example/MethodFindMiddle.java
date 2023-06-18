package org.example;

import java.util.Scanner;

public class MethodFindMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String input = sc.next();
        System.out.println("Your input:"+input);



        String answer =  findMiddle(input);
        System.out.println("Answer is:"+answer);


    }
    public static String findMiddle (String input){
        String answer = "";
        if(input.length()%2==0 && input.length()>2){
          String  result = input.substring(input.length()/2-1,input.length()/2+1);
           answer = result;

        } else if (input.length()/2!=0 && input.length()>2) {
            String result = input.substring(input.length()/2,input.length()/2+1);
            answer = result;
        }

        return answer;
    }

}
