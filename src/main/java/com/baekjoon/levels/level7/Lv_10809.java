package com.baekjoon.levels.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lv_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
        만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.*/
        int[] arr = new int[26];

     /*   for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }*/

        Arrays.fill(arr, -1); //배열 일괄 초기화하는 더 간단한 방법

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (arr[ch - 'a'] == -1) {  //-1일 때만 배열값 변경하기
                arr[ch - 'a'] = i;
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
