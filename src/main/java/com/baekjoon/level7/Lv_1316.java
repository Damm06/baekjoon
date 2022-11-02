package com.baekjoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int cnt =  0;

        for (int i = 0; i < N; i++) {
            if (check()) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    //체크할 함수 만들기
    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int previous = 0;
        String str = br.readLine(); //어차피 함수 자체를 반복하니까 자동적으로 새로운 라인 읽게 됨

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (previous != now) {
                if (!check[now - 'a']) { //처음 등장한 문자일 경우 (false일 경우)
                    check[now - 'a'] = true; //true로 바꿈
                    previous = now; //다음 순서를 위해 현재 문자로 변경해주기
                }
                else { //이미 나온 적이 있는 경우
                    return false; //종료
                }
            }
        }
        return true;
    }
}
