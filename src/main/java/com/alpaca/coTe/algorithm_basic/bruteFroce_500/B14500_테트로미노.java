package com.alpaca.coTe.algorithm_basic.bruteFroce_500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14500_테트로미노 {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int n;
    static int m;
    static int arr[][];
    static boolean isUsed[][];
    static int max = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        isUsed = new boolean[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                isUsed[i][j] = true;
                dfs(i, j, 0, arr[i][j]);
                isUsed[i][j] = false;
            }
        }

        System.out.println(max);
    }

    static void dfs(int x,int y, int dept, int sum){
        if(dept == 3){
            max = Math.max(max,sum);
            return;
        }
        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m && !isUsed[nx][ny]) {

                if(dept ==1){
                   isUsed[nx][ny] = true;
                   dfs(x,y,dept +1,sum + arr[nx][ny]);
                   isUsed[nx][ny] = false;
                }

                isUsed[nx][ny] = true;
                dfs(x,y,dept +1,sum + arr[nx][ny]);
                isUsed[nx][ny] = false;

            }
        }
    }
}
