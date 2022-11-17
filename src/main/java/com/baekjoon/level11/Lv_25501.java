package com.baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lv_25501 {
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            count = 0; //문자열 입력 전에 0으로 초기화하기
            System.out.println(isPalindrome(br.readLine()) + " " + count);
            //isPalindrome 리턴값은 1 또는 0.
        }
    }

    //start는 왼쪽 인덱스, last는 오른쪽 인덱스
    public static int recursion(String s, int start, int last){
        count++; //호출 횟수 증가시키기
        if(start >= last) return 1;
        //왼쪽과 오른쪽 인덱스 수가 같거나 왼쪽이 더 크면 참.
        //왜냐하면 재귀 호출을 계속했다는 의미이고 양쪽이 대칭으로 똑같았다는 의미.
        else if(s.charAt(start) != s.charAt(last)) return 0;
         //만약 양쪽 인덱스 위치가 같지 않으면 거짓. -> 대칭 문자가 다르다는 의미
        else return recursion(s, start + 1, last - 1);
        //참 또는 거짓이 나올 때까지 왼쪽 인덱스 수 증가 시켜서 오른쪽으로 한 칸 씩 이동,
        //오른쪽 인덱스는 마이너스 시켜서 왼쪽으로 한 칸 씩 이동하면서 서로 대칭으로 비교한다.
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
         //순서대로 입력값, 시작 인덱스 위치(왼쪽 인덱스), 오른쪽 인덱스 위치(문자열 길이 -1이 마지막).
    }
}
