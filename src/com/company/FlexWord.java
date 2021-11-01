package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FlexWord {
    public ArrayList<String> solution(String[] param) {
        ArrayList<String> result = new ArrayList<>();
        /**
         * solution 1
         * using StringBuilder
         */

        for (String str : param) {
            String reverse = new StringBuilder(str).reverse().toString();
            result.add(reverse);
        }

        /**
         * solution 2
         * using lt,rt
         */
        for (String str : param) {
            char[] array = str.toCharArray();
            char temp;
            int lt = 0, rt = array.length - 1;
            while (lt < rt) {
                temp = array[lt];
                array[lt++] = array[rt];
                array[rt--] = temp;
            }

            result.add(String.valueOf(array));
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.valueOf(scan.nextLine());

        String[] stringArray = new String[num];
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scan.nextLine();
        }

        for (String str : stringArray) {
            char[] array = str.toCharArray();
            char temp;
            int lt = 0, rt = array.length - 1;
            while (lt < rt) {
                temp = array[lt];
                array[lt++] = array[rt];
                array[rt--] = temp;
            }

            result.add(String.valueOf(array));
        }

        result.forEach(r -> {
            System.out.println("r = " + r);
        });
    }
}
