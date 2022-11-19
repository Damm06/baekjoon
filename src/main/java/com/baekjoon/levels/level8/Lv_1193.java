package com.baekjoon.levels.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        //분모와 분자의 핪을 T라고 하면 대각선을 기준으로 T 값이 같고 1씩 증가한다.
        //대각선의 갯수는 T -1개.
        //T가 짝수, 또는 대각선 칸의 갯수가 홀수이면, 왼쪽 아래에서 오른쪽 위 방향 ( ↗︎ ) 으로 진행.
        //T가 홀수, 또는 대각선 칸의 갯수가 짝수이면, 오른쪽 위에서 왼쪽 아래 방향 ( ↙︎ ︎ ) 으로 진행.
        //즉, T % 2 = 0 일 때는 대각선 위 방향, 1 일 때는 아래 방향으로 진행 된다.

        int cross = 1; //해당 법위 대각선 칸 갯수 == T
        int sum = 0; //해당 대각선 직전 대각선까지 칸의 누적 합 (블럭 갯수)

        //sum 과 X 의 차이를 이용하면 해당 대각선에서 몇 번째 분수인지 알 수 있다.
        //위의 계산은 대각선의 갯수를 이용해서 짠다.

        while (true) {
            //직전 대각선 누적합 + 해당 대각선 갯수 이용한 범위 판별
            if (X <= sum + cross) {
                if (cross % 2 == 1) { //대각선의 갯수가 홀수일 때
                    //분자가 큰 수부터 시작
                    //분자는 대각선상 블럭의 갯수 - (X번째 - 직전 대각까지의 블럭 갯수 -1)
                    //분모는 X번째 - 직전 대각선까지의 블럭 갯수
                    System.out.print((cross - (X - sum - 1)) + "/" + (X - sum));
                    break;
                }
                else { //대각선의 갯수가 짝수일 때
                    //홀수일 때의 출력을 반대로 해줌
                    System.out.print((X - sum) + "/" + (cross - (X - sum - 1)));
                    break;
                }
            } else {
                sum += cross;
                cross++;
            }
        }
    }
}