package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SelectWordReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine();

        char[] array = inputStr.toCharArray();
        char temp;
        int lt = 0, rt = array.length - 1;

        while (lt < rt) {
            if (Character.isAlphabetic(array[lt]) &&
                    Character.isAlphabetic(array[rt])) {
                temp = array[lt];
                array[lt] = array[rt];
                array[rt] = temp;
                lt++;
                rt--;
            }else if (Character.isAlphabetic(array[lt])){
                rt--;
            }else{
                lt++;
            }

        }

        System.out.println(String.valueOf(array));

    }
}
