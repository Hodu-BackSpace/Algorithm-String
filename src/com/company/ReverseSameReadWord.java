package com.company;

import java.util.Scanner;

public class ReverseSameReadWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine();
        String lowerInput = inputStr.toLowerCase();
        boolean isTrue = true;


        for (int i = 0; i < lowerInput.length() / 2; i++) {
            if (lowerInput.charAt(i) != lowerInput.charAt(lowerInput.length() - 1 - i)) {
                isTrue = false;
                break;
            }
        }
        if (isTrue)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
