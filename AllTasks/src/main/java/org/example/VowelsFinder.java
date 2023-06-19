package org.example;

import java.util.Scanner;

public class VowelsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = sc.next().toLowerCase();

        int vovelsCount = vowelsFinders(input);
        System.out.println("Number of vowels count in String:"+vovelsCount);

    }
    public static int vowelsFinders(String input) {
        int count = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
