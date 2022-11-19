package com.baekjoon.levels.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 1; //최소 루트 (겹 수) -> 거리
        int range = 2; //범위 (최솟값 기준)

        //방의 갯수는 등차수열 꼴로 늘어남
        //1개일 때는 1이므로 범위는 2개부터 시작해서 +6 씩 1거리가 증가
        //1거리가 늘어날 때 마다 +6을 하던 값에 +6을 해줘서 다음 번엔 +12를 해줌
        if (N == 1) {
            System.out.print(1);
        } else {
            while (range <= N) {
               range  = range + (6 * cnt);
                cnt++;
            }
            System.out.print(cnt);
        }
    }
}
