package com.baekjoon.levels.level1;

import java.io.*;

public class Lv_2588 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a * (b % 10)); //일의 자리
        System.out.println(a * (b % 100 / 10)); //십의 자리
        System.out.println(a * (b / 100)); //백의 자리
        System.out.println(a * b);

        br.close();
    }
}
