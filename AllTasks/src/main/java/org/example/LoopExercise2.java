package org.example;

import java.util.ArrayList;
import java.util.List;

public class LoopExercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int num = 1000; num < 10000; num++) {
            int firstTwoDigits = Integer.parseInt(String.valueOf(num).substring(0, 2));
            int lastTwoDigits = Integer.parseInt(String.valueOf(num).substring(2));

            if (num == firstTwoDigits + lastTwoDigits) {
                numbers.add(num);
            }
        }

        System.out.println(numbers);
    }
}
