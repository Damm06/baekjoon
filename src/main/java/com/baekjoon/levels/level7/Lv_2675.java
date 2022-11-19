package com.baekjoon.levels.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //테스트 케이스 개수

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" "); //문자열 분리

            int X = Integer.parseInt(str[0]); //반복 횟수
            String s = str[1]; //첫번째 문자

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < X; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
