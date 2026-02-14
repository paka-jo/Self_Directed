package com.alpaca.coTe.algorithm_basic.bruteForce_530;

import java.util.Scanner;

public class B9095_1_2_3더하기 {

    static int n;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int t = sc.nextInt();

        for(int i =4; i<11; i++){
            dp[i] = dp[i-1] + dp[i-2] +dp [i-3];
        }

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            System.out.println(dp[a]);
        }

    }
}
