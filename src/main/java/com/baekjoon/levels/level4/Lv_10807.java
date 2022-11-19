package com.baekjoon.levels.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int target = Integer.parseInt(br.readLine());

        int count = 0;
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) == target) {
                count++;
            }
        }
        System.out.print(count);
    }
}
