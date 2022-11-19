package com.baekjoon.levels.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_2775 {
    public static int[][] APT = new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        make_APT();

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); //층수
            int n = Integer.parseInt(br.readLine()); //호수

            sb.append(APT[k][n]).append('\n');
        }
        System.out.println(sb);
    }
    public static void make_APT() {
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; //1층 1호
            APT[0][i] = i; //0층 1호
        }

        for (int i = 1; i < 15; i++) { //1층부터 14층까지 반복
            for (int j = 2; j < 15; j++) { //2초부텉 14호까지 반복
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
    }
}
