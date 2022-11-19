package com.baekjoon.levels.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_1978 {
    static int cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt = 0;
        int N = Integer.parseInt(br.readLine());
        primeNumber(); //에라토스테네스의 체 메서드 호출
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            //num이 지워진 수가 아니면 소수니까 cnt +1
            if (arr[num] != 0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    //에라토스테네스의 체 메서드
    static void primeNumber() {
        arr = new int[1001]; //n의 범위가 1000까지니까 1000크기의 배열 선언
        int n = 1000;
        //배열 초기화
        for (int i = 2; i<= n; i++) {
            arr[i] = i;
        }
        //2부터 시작해서 i의 배수들을 배열에서 지워줌
        for (int i = 2; i <= n; i++) {
            //이미 지워진 수는 건너뜀
            if (arr[i] == 0) continue;
            for (int j = i+i; j <= n; j += i) {
                arr[j] = 0;
            }
        }
    }
}
