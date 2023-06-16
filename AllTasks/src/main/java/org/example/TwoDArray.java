package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] array = new int[6][6];
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

            scanner.close();

            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int currentSum = calculateHourglassSum(array, i, j);
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
            }

            System.out.println("Max Sum: " + maxSum);
        }


        public static int calculateHourglassSum(int[][] array, int row, int col) {
            int sum = 0;
            sum += array[row][col] + array[row][col + 1] + array[row][col + 2];
            sum += array[row + 1][col + 1];
            sum += array[row + 2][col] + array[row + 2][col + 1] + array[row + 2][col + 2];
            return sum;
        }
    }


