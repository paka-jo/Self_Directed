package com.alpaca.coTe.algorithm_bruteFroce_510;

import java.util.Scanner;

public class B15641_N과M_3 {

    static StringBuilder sb = new StringBuilder();
    static int[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];

        fun(n,m,0);

        System.out.println(sb);
    }

    private static void fun(int n,int m,int dept){
        if(dept == m){
            for(int i=0; i<arr.length; i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=0;i<n;i++){
                arr[dept] = i+1;
                fun(n,m,dept+1);

        }
    }
}
