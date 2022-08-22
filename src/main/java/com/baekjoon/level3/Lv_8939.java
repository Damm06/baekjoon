package com.baekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_8939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
