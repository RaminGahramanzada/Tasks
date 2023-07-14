package org.example;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Rombun hundurluyunu yaz:");
       int hundurluk =sc.nextInt();


          for (int i = 0; i <=hundurluk ; i++) {
              for (int j = 0; j <=hundurluk-i ; j++) {
                  System.out.print(" ");
              }
              for (int k = 0; k <=i ; k++) {
                  System.out.print("* ");
              }
              System.out.println();
          }
          for (int i = hundurluk-1; i >=0 ; i--) {
              for (int j = 0; j <=hundurluk-i ; j++) {
                  System.out.print(" ");
              }
              for (int k = 0; k <=i ; k++) {
                  System.out.print("* ");
              }
              System.out.println();
          }

        }

    }

