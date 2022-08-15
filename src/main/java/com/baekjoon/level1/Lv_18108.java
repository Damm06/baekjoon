package com.baekjoon.level1;

import java.io.*;

public class Lv_18108 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int year = Integer.parseInt(str);

        System.out.println(year - 543);
    }
}
