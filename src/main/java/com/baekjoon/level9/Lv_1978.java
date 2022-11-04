package com.baekjoon.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {

        }

    }
    //에라토스테네스의 체 방법 = 시간 복잡도 O(nlog(logn))
    public static boolean[] make_Prime(int n) {
        boolean[] Prime = new boolean[n + 1]; //0부터 시작하므로 +1

        Prime[0] = true;
        Prime[1] = true; //0,1은 소수가 아니므로 true



        return Prime;
    }
}
