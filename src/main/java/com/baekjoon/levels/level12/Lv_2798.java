package com.baekjoon.levels.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = blackJack(arr, N, M);
        System.out.print(sum);
    }

    static int blackJack(int[] arr, int N, int M) {
        int sum = 0;
        /*
        * 만약 카드가 1,2,3,4,5 총 5장이면 마지막에 뽑는 건 3,4,5를 순서대로 뽑게 됨
        * 그래서 첫 번째 카드는 3을 뽑기 때문에 나머지 4,5 에 해당하는 범위까지 순회 안해도 됨
        * 그래서 첫번째 카드는 N - 2 해주는거고 나머지도 마찬가지의 원리
        * */
        //첫 번째 카드는 N - 2 까지만 순회하면 됨.
        for (int i = 0; i < N - 2; i++) {
            //두 번째 카드는 첫 카드 다음부터 N - 1 까지만 순회
            for (int j = i + 1; j < N - 1; j++) {
                //세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
                for (int k = j + 1; k < N; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];

                    if (M == tmp) {
                        return tmp;
                    }

                    if (sum < tmp && tmp < M) {
                        sum = tmp;
                    }
                }
            }
        }
        return sum;
    }
}
