package com.company;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.valueOf(scan.nextLine());
        String inputStr = scan.nextLine();

        char[] buffer = new char[num];

        for (int i = 0; i < num; i++) {
            char c = (char) Integer.parseInt(inputStr.substring(i * 7, (i * 7) + 7).replaceAll("[#]", "1").replaceAll("[*]", "0"), 2);
            buffer[i] = c;
        }

        System.out.println(String.valueOf(buffer));
    }
}
