package com.baekjoon.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Lv_3052 {
    public static void main(String[] args) throws IOException {
        //hashSet은 중복 저장을 허용 안하기 때문에 중복값이 없으면 저장되면서 true를 반환함.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }
        //size는 저장되어 있는 원소의 갯수를 반환함
        System.out.print(hashSet.size());
    }
}
