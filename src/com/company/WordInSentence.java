package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordInSentence {

    public String solution(String inputStr){
        String result = "";
        int pos,max = Integer.MIN_VALUE;
        // indexOf를 통해 pos를 가져오는데 이는 찾지 못하면 -1을 리턴한다
        while((pos = inputStr.indexOf(" ")) != -1){
            // substring(0,pos);를 하면 실제 스트링은 substring(0,pos-1)이다.
            String s = inputStr.substring(0, pos);
            if (s.length() > max) {
                max = s.length();
                result = s;
            }
            inputStr = inputStr.substring(pos + 1);
            // +1 을 하는 이유는 pos가 가르키는 위치는 현재 공백이므로 그 다음부터 짤라내야 한다.
        }
        return result;
    }

    public static void main(String[] args) {
        int max = 0,index = 0;
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();

        String[] words = inputStr.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                index = i;
            }
        }

        System.out.println(words[index]);

    }
}
