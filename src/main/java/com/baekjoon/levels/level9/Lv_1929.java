package com.baekjoon.levels.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_1929 {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N + 1];
        get_prime();

        StringBuilder sb = new StringBuilder();

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    //에라토스테네스의 체 방법
    public static void get_prime() {
        prime[0] = prime[1] = true;
        //true = 소수 아님, false = 소수

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
