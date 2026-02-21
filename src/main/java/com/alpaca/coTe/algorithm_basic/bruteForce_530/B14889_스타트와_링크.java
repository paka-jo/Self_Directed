package com.alpaca.coTe.algorithm_basic.bruteForce_530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14889_스타트와_링크 {

    static int n;
    static int[][] ability;
    static boolean[] isVisited;
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        ability = new int[n][n];
        isVisited = new boolean[n];
        min =0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                ability[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(min);
    }

    static void dfs(int idx,int count){
        if(count == n/2){
            dif();
            return;
        }
        for(int i = idx; i <n; i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                dfs(i+1,count+1);
                isVisited[i] = false;
            }
        }
    }

    static  void dif(){
        int start = 0;
        int link =0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(isVisited[i] == true && isVisited[j] == true){
                    start += ability[i][j];
                    start += ability[j][i];
                }
                else if( isVisited[i] == false && isVisited[j] == false){
                    link += ability[i][j];
                    link += ability[j][i];
                }
            }
        }

        int val = Math.abs(start - link);

        if(val == 0){
            System.out.println(val);
            System.exit(0);
        }

        min = Math.min(val,min);
    }
}
