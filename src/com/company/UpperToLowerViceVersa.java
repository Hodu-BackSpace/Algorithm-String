package com.company;

import java.util.Scanner;

public class UpperToLowerViceVersa {
    public static void main(String[] args) {
        String result = "";
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine();

        for (char c : inputStr.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            }else{
                result += Character.toUpperCase(c);
            }
        }
        System.out.println("result = " + result);
    }
}
