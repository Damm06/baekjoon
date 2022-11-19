package com.baekjoon.levels.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int type = Integer.parseInt(br.readLine());
        int s = 0;

        for (int i = 1; i <=type; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            s += (price * num);
        }
        if (total == s)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
