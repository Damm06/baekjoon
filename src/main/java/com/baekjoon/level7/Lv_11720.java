package com.baekjoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;

        for (byte value : br.readLine().getBytes()) {
            sum += (value - '0'); //UTF-16에 맞게 인코딩 되므로 0 또는 48 빼줘야 함
        }
        System.out.print(sum);
    }
}
