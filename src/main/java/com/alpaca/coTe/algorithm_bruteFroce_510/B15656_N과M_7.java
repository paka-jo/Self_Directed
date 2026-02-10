package com.alpaca.coTe.algorithm_bruteFroce_510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15656_N과M_7 {

    static int num[];
    static int arr[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        num = new int[n];
        arr = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        fun(n,m,0);

        System.out.println(sb);
    }

    public static void fun(int n, int m,int dept){
        if(dept == m){
            for(int i=0; i<m; i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=0;i<n;i++){
            arr[dept] = num[i];
            fun(n,m,dept+1);
        }
    }
}
