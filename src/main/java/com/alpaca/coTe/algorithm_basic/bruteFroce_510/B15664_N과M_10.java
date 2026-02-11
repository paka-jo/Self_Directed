package com.alpaca.coTe.algorithm_basic.bruteFroce_510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15664_N과M_10 {

    static int n;
    static int m;
    static int num[];
    static int arr[];
    static boolean isUsed[];
    static int start;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        num = new int[n];
        arr = new int[m];
        isUsed = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        start = 0;

        fun(0,0);

        System.out.println(sb);
    }

    static void fun(int start, int dept) {
        if (dept == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        int used = 0;
        for (int i = start; i < n; i++) {
            if (used != num[i]) {
                arr[dept] = num[i];
                used = num[i];
                fun(i+1,dept + 1);

                /*처음에 작성한 코드 (의도한 코드가 논리성과 어긋남)*/
//            if (!isUsed[i] && used != num[i]) {
//                isUsed[i] = true;
//                arr[dept] = num[i];
//                used = num[i];
//                fun(i,dept + 1);
//                isUsed[i] = false;
            }
        }
    }
}
