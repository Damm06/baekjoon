package com.baekjoon.levels.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_2231 {
    public static void main(String[] args) throws IOException {
        /*
        * 임의의 값 M, M의 생성자는 N, 생성자 N의 각 자리수의 합을 SUM 이라고 가정.
        * M = N + SUM 이고, M > N.
        * N = M - SUM 이라서 SUM 의 범위에 따라 N 의 범위가 정해짐.
        * SUM 의 범위는 한 자리수 기준 9이고 자릿수 늘어날 때마다 9 * 자릿수 이다.
        * 1 <= M <= 1,000,000 이므고 M은 1,000,000 을 제외하면 최대 6자리.
        * M > N 이므로 N 도 6자리 이하니까 SUM 은 1 ~ 54가 최대임.
        * 그러므로 두 단계 낮은 자리 수의 N이 M의 생성자가 될 수 없음.
        * M 의 자릿수가 세자리면 N도 세자리거나 한 단계 낮은 두자리 수.
        * M 자리수가 K라고 가정.
        * N이 K 자리수인 경우: M - SUM(K)의 최대값 <= N < M
        *
        * N을 만족하는 최소 K를 찾는 것이 중요.
        * 1부터 N까지 전부 순회할 수도 있지만 조금이라도 거를 수 있는 게 있다면 거르는 게 효율적
        * 최소 K를 찾는다는 건 K를 작게 만들어야함. 그러려면 K의 각 자릿수 합이 가장 커야함.
        * 그래서 K의 각 자릿수가 가질 수 있는 최댓값인 9에 K값의 길이를 곱해준 값을 빼준다.
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strN = br.readLine(); //길이를 활용하기 위해 일단 문자열로 변수에 담음
        int len = strN.length();
        int N = Integer.parseInt(strN); //다시 int로 변환해서 담아줌
        int result = 0; //결과 출력할 변수

        //i가 가능한 최솟값은 N - (N * 9)이고, 여기서의 각 자릿수부터 시작하면 됨.
        for (int i = (N - (len * 9)); i < N; i++) {
            int num = i;
            int sum = 0; //각 자릿수 합을 담을 변수

            while (num != 0) {
                sum += num % 10; //각 자릿수를 더함
                num /= 10;
            }

            if (sum + i == N) { //i 값과 각 자릿수의 누적합이 같은 경우 = 생성자를 찾은 경우임
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}
