package com.alpaca.coTe.algorithm_basic.bruteFroce_520;

import java.util.Scanner;

public class B10974_모든_순열 {

    static int n;
    static int[] arr;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        isUsed = new boolean[n];

        fun(0);

        System.out.println(sb);
    }

    static void fun(int dept){
        if(dept == n){
            for(int i=0; i<n; i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i =0; i<n; i++){
            if(!isUsed[i]) {
                isUsed[i] = true;
                arr[dept] = i + 1;
                fun(dept + 1);
                isUsed[i] = false;
            }
        }
    }
}
