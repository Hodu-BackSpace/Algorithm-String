package com.company;

import java.util.Scanner;

// 대소문자 구분이 없다 => 모두다 toUpperCase()로 변환
public class StringFind {

    public static void main(String[] args) {
        int result = 0;
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.next();
        char inputChar = scan.next().toUpperCase().charAt(0);

        for (char c : inputStr.toUpperCase().toCharArray()) {
            if (inputChar==c) result++;
        }

        System.out.println(result);
    }
}
