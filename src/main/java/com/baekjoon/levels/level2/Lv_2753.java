package com.baekjoon.levels.level2;

import java.io.*;

public class Lv_2753 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
        //윤년이면 1, 아니면 0을 출력
        int year = Integer.parseInt(br.readLine());
        if (year % 4 == 0) {
            if (year % 100 != 0) System.out.println(1);
            else if (year % 400 == 0) System.out.println(1);
            else System.out.println(0);
        }
        else System.out.println(0);
    }
}
