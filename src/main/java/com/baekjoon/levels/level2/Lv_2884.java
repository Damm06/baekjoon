package com.baekjoon.levels.level2;

import java.io.*;
import java.util.StringTokenizer;

public class Lv_2884 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        //분이 45 ~ 59 일경우는 분에서만 45 빼주면 됨
        if (minute < 45) {
            hour--;
            minute = 60 - (45 - minute);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        } else {
            System.out.println(hour + " " + (minute - 45));
        }
    }
}
