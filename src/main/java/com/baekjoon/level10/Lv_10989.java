package com.baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        // 수의 범위 (0 ~ 10000) 이지만, 문제에서 1부터라고 했으므로 0은 사실상 제외
        int[] arr = new int[10001]; //중복된 값이 있으므로 int 배열로 만들기

        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            arr[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        // 0은 입력범위에서 없으므로 1부터 시작
        for (int i = 1; i < 10001; i++) {
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while (arr[i] > 0) {
                sb.append(i).append('\n');
                arr[i]--;
                //입력받은 정수가 7, 7, 7, 7이라면 arr[7] = 4. 즉 7이라는 정수가 4개 있다는 의미.
                //출력하기 위해서 arr[7]을 4번 출력해야하니 arr[7]-- (arr[7] = arr[7] - 1 과 동일)을 해주어야함
                //빈도수가 4번 3번 2번 1번 0번으로 줄어서 출력이 총 4번이 됨
            }
        }
        System.out.print(sb);
    }
}
