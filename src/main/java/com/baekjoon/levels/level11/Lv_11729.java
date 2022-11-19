package com.baekjoon.levels.level11;

import java.io.*;

public class Lv_11729 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //이동 횟수는 2의 N승 - 1
        bw.write((int) (Math.pow(2, N) - 1) + "\n");

        Hanoi(N, 1, 2, 3);

        bw.flush();
        bw.close();
    }

    public static void Hanoi(int N, int start, int mid, int to) throws IOException {

        /*
        * N: 원판 갯수
        * start: 출발지
        * mid: 옮기기 위해 이동해야 할 장소
        * to: 목적지
        * */

        //이동할 원판의 갯수가 1개일 경우
        if (N == 1) {
            bw.write(start + " " + to + "\n");
            return;
        }

        //A -> C로 옮긴다고 가정

        //STEP 1: N-1개를 A에서 B로 이동 (=start 지점의 N-1개의 원판을 mid 지점으로 옮김)
        Hanoi(N -1, start, to, mid);

        //STEP 2: 1개를 A에서 C로 이동 (=start 지점의 N번째 원판을 to 지점으로 옮김)
        bw.write(start + " " + to + "\n");

        //STEP 3: N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮김)
        Hanoi(N-1, mid, start, to);
    }
}
