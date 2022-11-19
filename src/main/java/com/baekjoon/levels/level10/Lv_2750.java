package com.baekjoon.levels.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lv_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //Arrays.sort로 정렬
        //시간복잡도는 평균 O(nlogn), 최악의 경우에는 O(n2)
        Arrays.sort(arr);

        for (int a : arr) {
            sb.append(a).append('\n');
        }
        System.out.print(sb);
    }
}
//카운팅 정렬이 시간복잡도 가장 빠르므로 공부해두기 + 다른 정렬 방법도 공부