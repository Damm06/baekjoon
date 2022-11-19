package com.baekjoon.levels.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int up = Integer.parseInt(st.nextToken()); //올라갈 수 있는 높이
        int down = Integer.parseInt(st.nextToken()); //미끄러지는 높이
        int len = Integer.parseInt(st.nextToken()); //정상 목표

        int day = (len - down) / (up - down); //일수 구하기

        if ((len - down) % (up - down) != 0) { //남은 블럭이 있을 경우
            day++;
        }
        System.out.print(day);
    }
}
