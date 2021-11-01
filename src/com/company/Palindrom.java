package com.company;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String inputStr = scan.nextLine().toLowerCase();
        String inputStr = scan.nextLine().toLowerCase().replaceAll("[^a-z]", "");

//        for (int i = 0; i < inputStr.length(); i++) {
//            if (Character.isAlphabetic(inputStr.charAt(i))) {
//                outputStr += inputStr.charAt(i);
//            }
//        }

//        boolean check = true;

//        for (int i = 0; i < outputStr.length() / 2; i++) {
//            if (outputStr.charAt(i) != outputStr.charAt(outputStr.length() - 1 - i)) {
//                check = false;
//                break;
//            }
//        }
//
//        if (check){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

        String outputStr = new StringBuilder(inputStr).reverse().toString();

        if (inputStr.equals(outputStr)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
