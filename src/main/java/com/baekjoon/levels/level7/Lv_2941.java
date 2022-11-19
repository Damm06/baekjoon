package com.baekjoon.levels.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //크로아티아 알파벳 갯수 구하기
        String s = br.readLine();
        int length = s.length();
        int cnt = 0;

        /* 크로아티아 알파벳 종류
        * c=
        * c-
        * dz=
        * d-
        * lj
        * nj
        * s=
        * z=
        * */

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (ch == 'c' && i < length - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (ch == 'd' && i < length - 1) {
                if (s.charAt(i + 1) == '-') {
                    i++;
                }
                else if (s.charAt(i + 1) == 'z' && i < length - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            } else if ((ch == 'l' || ch == 'n') && i < length -1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if ((ch == 's' || ch == 'z') && i < length -1) {
                if (s.charAt(i + 1) == '=') {
                    i++;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
