package com.baekjoon.levels.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= X; i++) {
            for (int j = 1; j <= X-i; j++) {
                sb.append(' ');
            }
            for (int k = 1; k <= i; k++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
