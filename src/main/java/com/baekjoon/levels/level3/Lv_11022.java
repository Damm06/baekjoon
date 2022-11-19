package com.baekjoon.levels.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= X; i++) {
            st= new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);
        }
        br.close();
    }
}
