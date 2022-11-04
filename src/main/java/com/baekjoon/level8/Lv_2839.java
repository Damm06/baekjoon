package com.baekjoon.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //정확하게 N 킬로그램을 만들 수 없다면 -1 출력
        //3kg 봉지, 5kg 봉지 2종류 있음

        if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        else if (N == 4 || N == 7) {
            System.out.println(-1);
        } //아래  2경우는 이해가 좀 더 필요함.
        else if (N % 5 == 1 || N % 5 == 3) { //5의 배수 +1 또는 +3 일 경우
            System.out.println((N  / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) { //5의 배수 +2 또는 +4 일 경우
            System.out.println((N / 5) + 2);
        }
    }
}
