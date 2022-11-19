package com.baekjoon.levels.level1;

import java.io.*;
import java.util.*;

public class Lv_3003 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        ArrayList<Integer> chess = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            chess.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> NumChess = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,8));
        int result;
        for(int i = 0; i < 6; i++) {
            result = NumChess.get(i) - chess.get(i);
            System.out.print(result + " ");
        }
    }
}


