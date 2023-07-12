package org.example;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[0][2] = 5;

        arr[1][0] = 2;
        arr[1][1] = 4;
        arr[1][2] = 6;

        arr[2][0] = 3;
        arr[2][1] = 5;
        arr[2][2] = 8;

        int index = 0;
        int[] siraSayi = {0, 1, 2, 5, 4, 3, 6, 7, 8};
        while (index < 9) {
            int row = siraSayi[index] / 3;
            int col = siraSayi[index] % 3;
            System.out.print(arr[row][col]+",");

//
//            for (int i = 0; i <1; i++) {
//                System.out.print(",");
//
//            }
            index++;

        }
    }
}
