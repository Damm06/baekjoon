package com.baekjoon.levels.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(N); i++) { //또는 중간꺼 i * i <= N 으로 바꿔도 됨
            while (N % i == 0) {
                sb.append(i).append('\n');
                N /= i;
            }
        }
        if (N != 1) {
            sb.append(N);
        }
        System.out.println(sb);
    }
}
