package com.alpaca.coTe.algorithm_basic.bruteFroce_520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10971_외판원_순회 {

    static int n;
    static int[][] w;
    static int[] arr;
    static boolean[] isUsed;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        isUsed = new boolean[n];
        w = new int[n][n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                w[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(min);
    }

    static void dfs(int dept){
        if(dept == n){
            int sum = 0;
            boolean isValid = true;
            for(int i=0;i<n-1;i++){
                if(w[arr[i]][arr[i+1]] == 0){
                    isValid = false;
                    break;
                }
                sum += w[arr[i]][arr[i+1]];
            }
            if(isValid && w[arr[n - 1]][arr[0]] != 0) {
                sum += w[arr[n - 1]][arr[0]];
                min = Math.min(sum, min);
            }
                return;
        }
        for(int i=0; i<n; i++){
            if(!isUsed[i]) {
                isUsed[i] = true;
                arr[dept] = i;
                dfs(dept+1);
                isUsed[i] = false;
            }
        }
    }
}
