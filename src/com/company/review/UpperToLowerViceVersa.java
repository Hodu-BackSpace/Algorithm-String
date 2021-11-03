package com.company.review;

import java.util.Scanner;

public class UpperToLowerViceVersa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        char[] charArray = inputStr.toCharArray();
        for (int i = 0; i < inputStr.length(); i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }else{
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        System.out.println(String.valueOf(charArray));

    }
}
