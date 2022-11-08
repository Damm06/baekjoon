package com.baekjoon.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_4948 {
    public static boolean[] prime = new boolean[246913];
/*    n > 123456 이므로 2n 은 최대 246912 이다.
	0 부터 시작하므로 246912 + 1*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        get_prime(); // 소수를 얻는 메소드 실행
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break; // n 이 0 일경우 종료

            int cnt = 0; // 소수 개수를 셀 변수

            for (int i = n + 1; i <= 2 * n; i++) {
                if (!prime[i]) cnt++;
            }
            sb.append(cnt).append('\n'); // 문자열로 이어준다
        }
        System.out.print(sb);
    }

    public static void get_prime() {
        prime[0] = prime[1] = true; // 0 과 1 은 소수가 아니므로 ture

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
