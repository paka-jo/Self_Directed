package com.alpaca.coTe.algorithm_basic.bruteFroce_510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15655_N과M_6 {

    static int num[];
    static int arr[];
    static boolean isUsed[];

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        num = new int[n];
        arr = new int[m];
        isUsed = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        fun(n, m, 0);

        System.out.println(sb);
    }

    static void fun(int n, int m, int dept) {
        if (m == dept) {
            for (int i = 0; i < m; i++) {
                for(int j = 0; j <m-1; j++) {
                    if(arr[j] >arr[j+1]){
                        return;
                    }
                }
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!isUsed[i]) {
                isUsed[i] = true;
                arr[dept] = num[i];
                fun(n, m, dept + 1);
                isUsed[i] = false;
            }
        }
    }
}
