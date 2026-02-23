package com.alpaca.coTe.algorithm_basic.bruteForce_530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15661_링크와_스타트 {

    static int n;
    static int[][] ability;
    static int min = Integer.MAX_VALUE;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        ability = new int[n][n];
        isVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                ability[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(min);
    }

    static void dfs(int dept) {
        if (n == dept) {
            dif();
            return;
        }

        isVisited[dept] = true;
        dfs(dept+1);
        isVisited[dept] = false;
        dfs(dept+1);
    }

    static void dif(){
        int start = 0;
        int link = 0;

        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(isVisited[i] == true && isVisited[j] == true){
                    start += ability[i][j];
                    start += ability[j][i];
                }
                else if(isVisited[i] == false && isVisited[j] == false){
                    link += ability[i][j];
                    link += ability[j][i];
                }
            }
        }

        int var = Math.abs(start-link);

        if(var == 0){
            System.out.println(0);
            System.exit(0);
        }

        min = Math.min(var,min);
    }
}