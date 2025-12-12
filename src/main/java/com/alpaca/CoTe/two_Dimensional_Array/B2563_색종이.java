package com.alpaca.CoTe.two_Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563_색종이 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 도형의 개수
        boolean[][] paper = new boolean[101][101];
        int count = 0;

        for(int i= 0; i<n; i++){
           st = new StringTokenizer(br.readLine());

           int x = Integer.parseInt(st.nextToken());
           int y = Integer.parseInt(st.nextToken());

           for(int j=x; j<x+10; j++){
               for(int k=y; k<y+10; k++) {
                   if(!paper[j][k]){
                       paper[j][k] = true;
                       count++;
                   }
               }
           }
        }
        br.close();
        System.out.println(count);
    }
}
