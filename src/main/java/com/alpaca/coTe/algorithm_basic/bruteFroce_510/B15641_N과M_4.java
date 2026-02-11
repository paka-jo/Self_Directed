package com.alpaca.coTe.algorithm_basic.bruteFroce_510;

import java.util.Scanner;

public class B15641_N과M_4 {

    static int[] arr;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];
        isUsed = new boolean[n];

        dfs(n,m,0,0);

        System.out.println(sb);
    }

    private static void dfs(int n, int m,int start, int dept){
        if(dept == m){
            for(int i=0; i< arr.length; i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=start; i<n; i++){
                arr[dept] = i +1;
                dfs(n,m,i,dept+1);
            }
        }
    }
