package com.alpaca.coTe.algorithm_basic.bruteFroce_520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B6603_로또 {

    static int n;
    static int[] num;
    static int[] arr;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n == 0){
                break;
            }
            num = new int[n];
            arr = new int[6];
            isUsed = new boolean[n];
            for(int i=0; i<n;i++){
                num[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0,0);

            sb.append('\n');
        }

        System.out.println(sb);
    }

    static void dfs(int dept,int start){
        if(dept == 6){
            for(int i=0; i<6; i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=start; i<n; i++){
            if(!isUsed[i]) {
                isUsed[i] = true;
                arr[dept] = num[i];
                dfs(dept + 1, i);
                isUsed[i] = false;
            }
        }
    }
}
