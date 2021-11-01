package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ShortDistanceWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputStr = scan.nextLine().toLowerCase().split(" ");

        char[] charArray = inputStr[0].toCharArray();
        char t = inputStr[1].charAt(0);
        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            int min = 9999;
            for (int j = i; j < charArray.length; j++) {
                if (charArray[j] == t) {
                    if (min > j - i) {
                        min = j - i;
                    }
                }
            }
            for (int k = i; k > -1; k--) {
                if (charArray[k] == t) {
                    if (min > i - k) {
                        min = i - k;
                    }
                }
            }
            test.add(min);
        }

        test.forEach(item -> System.out.print(item + " "));

    }
}
