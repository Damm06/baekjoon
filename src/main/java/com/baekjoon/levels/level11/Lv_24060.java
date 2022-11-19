package com.baekjoon.levels.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lv_24060 {

    static int[] tmp;
    static int count = 0;
    static int K;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        K = Integer.parseInt(st.nextToken());

        tmp = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, arr.length -1);
        System.out.print(result);
    }

    static void merge_sort(int A[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge_sort(A, low, mid);
            merge_sort(A, mid + 1, high);
            merge(A, low, mid, high);
        }
    }

    static void merge(int A[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= high) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while (i <= mid) {
            tmp[t++] = A[i++];
        }

        while (j <= high) {
            tmp[t++] = A[j++];
        }

        t = 0;
        i = low;

        while (i <= high) {
            count++;
            if (count == K) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }
}
