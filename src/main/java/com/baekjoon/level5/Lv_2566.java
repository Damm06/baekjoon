package com.baekjoon.level5;

import java.io.*;

public class Lv_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < strArr.length; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        int num = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (num < arr[i][j]) {
                    num = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(num);
        System.out.println((row + 1) + " " + (col + 1));
    }
}
