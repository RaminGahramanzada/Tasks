package org.example;

import java.util.Scanner;

public class ArrayTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n = scanner.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;


        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }




        }
