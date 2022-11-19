package com.baekjoon.levels.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        int[] arr;
        StringTokenizer st;

       for (int i = 0; i < test_case; i++) {
           st = new StringTokenizer(br.readLine(), " ");
           int N = Integer.parseInt(st.nextToken()); //학생수
           arr = new int[N];

           double sum = 0;

           for (int j = 0; j < N; j++) {
               int val = Integer.parseInt(st.nextToken());
               arr[j] = val;
               sum += val; //누적합
           }
           double mean = (sum / N); //평균
           double count = 0; //평균이상 학생수

           for (int j = 0; j < N; j++) {
               if (arr[j] > mean) {
                   count++;
               }
           }
           System.out.printf("%.3f%%\n",(count / N) * 100);
       }
    }
}
