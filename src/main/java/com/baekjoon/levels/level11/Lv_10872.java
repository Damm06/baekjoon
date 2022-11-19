package com.baekjoon.levels.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = factorial(N); //재귀 호출

        System.out.print(sum);
    }

    public static int factorial(int N) {
        if (N <= 1) return 1; // 재귀 종료 조건
        //1!과 0!은 1이기 때문.
        return N * factorial(N - 1);
    }
}

//반복문으로 풀기
/*
* public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int sum = 1;

		// N 이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다
		while(N != 0) {
			sum = sum * N;
			N--;
		}

		System.out.println(sum);

	}
}
* */