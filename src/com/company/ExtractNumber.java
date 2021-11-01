package com.company;

import java.util.Scanner;

public class ExtractNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine().toLowerCase().replaceAll("[a-z]", "");

        System.out.println(Integer.valueOf(inputStr));

    }
}
