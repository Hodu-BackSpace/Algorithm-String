package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine().toUpperCase();
        char[] charArray = inputStr.toCharArray();

        String result = "";
        Character temp = null;
        int num = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (temp == null) {
                temp = charArray[i];
            }else{
                if (charArray[i] == temp) {
                    num++;
                }else{
                    if (num > 1) {
                        result += temp + String.valueOf(num);
                    }else{
                        result += temp;
                    }
                    temp = charArray[i];
                    num = 1;
                }
            }
        }
        if (num > 1) {
            result += temp + String.valueOf(num);
        }else{
            result += temp;
        }

        System.out.println(result);
    }
}
