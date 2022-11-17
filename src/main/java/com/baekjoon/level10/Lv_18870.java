package com.baekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Lv_18870 {
    public static void main(String[] args) throws IOException {
        //배열의 각 원소값에 대한 '순위'를 매기는 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        /*
        * 1. 낮은 값이 높은 순위를 갖는다. (가장 높은 순위는 0순위다.)
        * 2. 중복되는 원소는 같은 순위를 갖는다.
        * 3. 순위를 매겨야하므로, 중복되지 않으면서 각 원소에 대한 순위를 매길 수 있는
        * 자료구조인 HashMap자료구조를 활용.
        * */

        int[] original = new int[N]; //원본 배열
        int[] sorted = new int[N]; //정렬 할 배열

        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>(); // rank를 매길 HashMap
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            sorted[i] = original[i] = Integer.parseInt(st.nextToken()); // 정렬할 배열과 원본 배열에 값을 넣어준다.
        }

        Arrays.sort(sorted); //정렬 할 배열에 대해서 정렬해준다.
        int rank = 0; //순위

        for (int val : sorted) { //정렬 된 배열을 순회하면서 map 에 넣어주기
            if (!rankMap.containsKey(val)) {
                /*
                 *  만약 앞선 원소가 이미 순위가 매겨졌다면, 중복되면 안되므로, 원소가 중복되지 않을 때만
                 *  map에 원소와 그에 대응되는 순위를 넣어준다.
                 */
                rankMap.put(val, rank);
                rank++; // map에 넣고나면 다음 순위를 가리킬 수 있도록 1을 더해준다.
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int key : original) { // 원본 배열을 차례대로 순회하면서 해당 원소에 대한 rank를 갖고온다.
            int ranking = rankMap.get(key); // 원본 배열 원소(key)에 대한 value(rank)를 갖고온다.
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
