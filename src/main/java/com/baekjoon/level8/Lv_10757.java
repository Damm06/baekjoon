package com.baekjoon.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Lv_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        // add() 메소드는 해당 BigInteger 객체와 파라미터(인자)로 들어온
        // BigInteger 객체의 더한 값을 BigInteger 타입으로 반환한다.

        System.out.println((A.add(B)).toString());
    }
}
