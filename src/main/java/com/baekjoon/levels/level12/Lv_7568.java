package com.baekjoon.levels.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
           arr[i][0] = Integer.parseInt(st.nextToken()); //몸무게
           arr[i][1] = Integer.parseInt(st.nextToken()); //키
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) continue; //자기 자신은 비교할 필요 없으므로 패스
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++; //i가 j보다 덩치가 작으면 rank를 증가 시킴킴
                }
           }
            sb.append(rank).append(' ');
        }
        System.out.print(sb);
    }
}
