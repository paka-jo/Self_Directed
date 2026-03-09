package com.alpaca.coTe.algorithm_basic.bruteForce_540;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1182_부분수열의_합 {

    static int n;
    static int s;
    static int[] num;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        num = new int[n];
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=n; i++){
            dfs(i,0,0,0);
        }

        System.out.println(count);

    }

    static void dfs(int a, int dept,int start,int sum){
        if(dept == a){
            if(sum == s){
                count++;
            }
            return;
        }

        for(int i=start; i<n;i++){
            dfs(a,dept+1,i+1,sum + num[i]);
        }
    }
}
