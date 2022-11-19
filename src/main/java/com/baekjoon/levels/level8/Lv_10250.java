package com.baekjoon.levels.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 갯수

        //YXX or YYXX, Y는 층수 XX는 방번호 순서
        //층수는

        //호수 계산하기
        //6층,12객식, 10번 손님이먄
        //1~6번째 손님은 뒤에 01호, 7번~12번 손님은 02호
        //손님 번호가 층수보다 작으면 무조건 반복문 순서대로 돌면서 01호, 층수보다 크면 층수 +1 하고, 층수  + 층수하고 다시 층수랑 비교,
        //그리고

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken()); //사실 안쓰이는 값이다.
            int guest = Integer.parseInt(st.nextToken());

            int level = guest % h; //층수
            int room = (guest / h) + 1; //1호부터 시작하기 때문에 +1 해줘야 함

            if (level == 0) { //만약 층수와 손님번호가 같으면 층수가 출력되게끔 해야함
                level = h;
                room -= 1;
            }

            int tmp = level * 100 + room;
            System.out.println(tmp);
        }
        br.close();
    }
}
