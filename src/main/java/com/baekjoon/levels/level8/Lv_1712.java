package com.baekjoon.levels.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //A는 고정비용, B는 재료비같은 가변 비용, C=노트북 가격
        //A는 한 번 만 더하고, B랑 C는 갯수별로 곱하기
        //총수입 = C
        //총비용 = A + B
        // BEP = 총수입이 총비용보다 많아져 이익이 발생하는 지점

        /*
        (n X C) = A + (n X B)
        nC = A + nB
         A = nC - nB
         A = n(C-B)
         n = A / C-B
         BEP = (A / C-B) + 1
         */

        // BEP가 없다면 -1을 출력하기
        /*
        * (A / C-B) + 1 > 0 //위 수식의 전제 조건은 0보다 커야 함. 이익이 발생한다는 의미
        * 반대로 이게 음수가 되면 이익이 발생하지 않는다는 의미
        * C - B < 0 라면 이익이 발생하지 않음
        * => C < B
        * 그리고 C와 B가 같으면 분모가 0이라서 0으로 갈수록 무한대에 가까워짐
        * 결론, 이익이 안 나는 경우는
        * => C <= B
        * */

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());

        if (C <= B) { //이익이 안 나는 경우
            System.out.print("-1");
        } else { //이익이 생기는 그 외의 경우
            System.out.println((A / (C-B)) + 1);
        }
    }
}
