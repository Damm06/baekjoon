package com.baekjoon.level11;

import java.io.*;

public class Lv_2447 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        //출력이 많다보니 StringBuilder 보다 BufferedWriter 가 더 성능이 좋았음.
        //가장 작을 단위까지 재귀를 호출하면서 가장 작을 단위가 될 때, 하나씩 배열을 채워나가는 방법
        //이렇게 문제를 분할하여 푸는 방식은 분할 정복 알고리즘의 토대
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        star(0,0, N, false);

//        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
//            for (int j = 0; j <N; j++) {
                bw.write(arr[i]);
                bw.write("\n");
//                sb.append(arr[i][j]);
//            }

//            sb.append('\n');
        }
        bw.flush();
        bw.close();
//        System.out.print(sb);
    }

    static void star(int x, int y, int N, boolean blank) {

        //공백일 경우
        if (blank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        //더 이상 쪼갤 수 없는 블록일 경우
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }

        /*
		   N=27 일 경우 한 블록의 사이즈는 9이고,
		   N=9 일 경우 한 블록의 사이즈는 3이듯
		   해당 블록의 한 칸을 담을 변수를 의미 size

		   count는 별 출력 누적을 의미
		 */

        int size = N / 3;
        int count = 0;
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) { //공백 칸일 경우
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}
