package com.alpaca.coTe.algorithm_basic.bruteFroce_510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15663_N과M_9 {

    static int n;
    static int m;
    static int[] num;
    static int[] arr;
    static boolean[] isUsed;
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
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        fun(0);

        System.out.println(sb);
    }

    static void fun (int dept){
        if(dept == m){
            for(int i=0;i<m;i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        int used = 0;
        for(int i=0; i<n; i++){
            if(!isUsed[i] && num[i] != used){
                isUsed[i] = true;
                arr[dept] = num[i];
                used = num[i];
                fun(dept+1);
                isUsed[i] = false;
            }
        }
    }
}
