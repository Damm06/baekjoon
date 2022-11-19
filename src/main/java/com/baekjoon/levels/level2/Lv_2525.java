package com.baekjoon.levels.level2;

import java.io.*;
import java.util.StringTokenizer;

public class Lv_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cook = Integer.parseInt(br.readLine());

        h = (((h * 60) + m) + cook) / 60;
        m = (((h * 60) + m) + cook) % 60;

        if ( h > 23) {
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}
