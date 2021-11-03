package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine().toUpperCase();
        String result = "";
        int cnt = 1;

        for (int i = 0; i < inputStr.length()-1; i++) {
            if (inputStr.charAt(i) == inputStr.charAt(i + 1)) {
                cnt++;
            }else{
                if (cnt > 1) {
                    result += inputStr.charAt(i) + String.valueOf(cnt);
                }else{
                    result += inputStr.charAt(i);
                }
                cnt = 1;
            }
        }

        if (cnt > 1) {
            result += inputStr.charAt(inputStr.length() - 1) + String.valueOf(cnt);
        }else{
            result += inputStr.charAt(inputStr.length() - 1);
        }

        System.out.println(result);
    }
}
