package com.baekjoon.levels.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));

    }
    public static int arithmetic_sequence(int num) {
        int cnt = 0;

        if (num < 100) {
            return num;
        } else {

            cnt = 99;

            for (int i = 100; i <= num; i++) {
                int hund = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hund - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
