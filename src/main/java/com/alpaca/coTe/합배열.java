package com.alpaca.coTe;

import java.util.Scanner;

public class 합배열 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] S = new int[N];
        for(int i =0;i<N; i++) {
            A[i] = sc.nextInt();
            S[i] = S[i-1] + A[i];
        }

        System.out.println(S[2]);

    }
}
