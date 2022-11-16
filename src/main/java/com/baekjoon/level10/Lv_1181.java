package com.baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Lv_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            //compare 메서드는 두 객체(인자)의 우선순위 비교 후, 정렬 알고리즘 안에서
            //위치를 바꾸거나 그대로 두거나 해줌.
            /*
            * 기본적으로 양수일경우 Arrays.sort()에서 정렬 알고리즘에 의해 위치를 바꾸고,
            * 0 이나 음의 정수인 경우는 두 객체의 위치는 바뀌지 않는다.
             * */
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) { //단어의 길이가 같을 경우
                    return s1.compareTo(s2); //단어 사전 순서로 정렬해주는 메서드
                } else { //그 외의 경우 단어 길이순으로 정렬
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');

        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) { //중복 안되는 단어만 출력하도록!
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
