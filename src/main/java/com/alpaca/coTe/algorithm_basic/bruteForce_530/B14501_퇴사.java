package com.alpaca.coTe.algorithm_basic.bruteForce_530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14501_퇴사 {

    static int n;
    static int[] date;
    static int[] cost;
    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        date = new int[n];
        cost = new int[n];

        for(int i =0; i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            date[i] = Integer.parseInt(st.nextToken());
            cost[i] = Integer.parseInt(st.nextToken());
        }
        fun(0,0);
        System.out.println(result);


    }

    static void fun(int start,int sum){
        result = Math.max(result,sum);

        for(int i=start;i<n;i++){
            if(i+ date[i] <= n){
            fun(i+ date[i],sum +cost[i]);}
        }
    }
}
