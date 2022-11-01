package com.baekjoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력 알파벳 전부 대문자로 바꿔주기, 문자열 분리하기
        int[] arr = new int[26]; //알파벳 갯수
        String s = br.readLine();

        /*
        * 대문자의 범위는 십진수로 65~90. 소문자의 범위는 97~122.
        * 예를 들어, 대문자 C 를 입력받았을 때, 배열의 세 번째 원소인 2 을 도출해내려면 C 는 67 이니 65 를 빼주면 된다.
        * 만약 소문자 e 를 입력받았을 경우에는 다섯 번째 원소인 4 를 도출해야하니 97을 빼주면 101 - 97 = 4 로 배열의 인덱스 값을 도출한다.
        * */

        for (int i = 0; i< s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { //대문자 범위
                arr[s.charAt(i) - 97]++; //해당 인덱스 값 1 증가
            } else { //소문자 범위
                arr[s.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); //대문자로 출력하려면 65 더하기
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
