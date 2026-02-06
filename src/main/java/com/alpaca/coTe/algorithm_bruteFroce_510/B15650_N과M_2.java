package com.alpaca.coTe.algorithm_bruteFroce_510;

import java.util.Scanner;

public class B15650_N과M_2 {

    static int[] arr;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];
        isUsed = new boolean[n];
        dfs(n,m,0);
        System.out.println(sb);
    }

    public static void dfs(int n, int m, int k) {
        if(k == m){
            for(int i=0; i<arr.length; i++){
                for(int j=0;j< arr.length-1; j++){
                    if(arr[j]>arr[j+1]) return;
                }
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i=0; i<n;i++){
            if(!isUsed[i]) {
                isUsed[i] = true;
                arr[k] = i +1;
                dfs(n, m , k+1);
                isUsed[i] = false;
            }
        }
    }

}
