package com.alpaca.coTe.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {

    static boolean[][] arr;
    static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
                for (int j = 0; j < m; j++) {
                    arr[i][j] = (a.charAt(j) == 'W');
            }
        }

        int wid = n-7;
        int len = m-7;

        for(int i=0; i<wid; i++){
            for(int j=0; j<len; j++){
                find(i,j);
            }
        }
        System.out.println(min);
    }
    static void find(int x,int y){

        int endWid = x+8;
        int endLen = y+8;
        int count =0;

        boolean F = arr[x][y];

        for(int i=x;i<endWid; i++){
            for(int j=y; j<endLen; j++){
                if(arr[i][j] != F){
                    count++;
                }  F =(!F);
            } F = !F;
        } count = Math.min(count, 64-count);
        min = Math.min(min,count);
    }
}
