package com.alpaca.coTe.algorithm_basic.bruteFroce_500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3085_사탕_게임 {

    static char[][] candy;
    static int n;
    static int max;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        candy = new char[n][n];

        for(int i=0;i<n;i++){
            String line = br.readLine();
            for(int j=0; j<n;j++){
                candy[i][j] = line.charAt(j);
            }
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n; j++){
                swap(i,j,i+1,j);
                chk();
                back(i,j,i+1,j);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                swap(i,j,i,j+1);
                chk();
                back(i,j,i,j+1);
            }
        }

        System.out.println(max);

    }

    public static void swap(int x1,int y1, int x2,int y2){
        char tmp = candy[x1][y1];
        candy[x1][y1] = candy[x2][y2];
        candy[x2][y2] = tmp;
    }

    public static void back(int x1,int y1, int x2,int y2){
        char tmp = candy[x2][y2];
        candy[x2][y2] = candy[x1][y1];
        candy[x1][y1] = tmp;
    }

    public static void chk(){
        for(int i =0; i<n; i++){
            int count = 1;
            for(int j=0;j<n-1;j++){
                if(candy[i][j] == candy[i][j+1]){
                    count++;
                } else {
                    max = Math.max(max, count);
                    count =1;
                }
            }
            max = Math.max(max, count);
        }

        for(int j =0; j<n; j++){
            int count = 1;
            for(int i=0;i<n-1;i++){
                if(candy[i][j] == candy[i+1][j]){
                    count++;
                } else {
                    max = Math.max(max, count);
                    count =1;
                }
            }
            max = Math.max(max, count);
        }
    }
}
