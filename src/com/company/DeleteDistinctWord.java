package com.company;

import java.util.Scanner;

public class DeleteDistinctWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine();
        String result = "";

        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.indexOf(inputStr.charAt(i)) == i) {
                result += inputStr.charAt(i);
            }
        }

        System.out.println(result);
    }
}
