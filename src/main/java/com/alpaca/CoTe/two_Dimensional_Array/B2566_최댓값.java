package com.alpaca.CoTe.two_Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566_최댓값 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] a = new int[9][9];

        for(int i=0; i<9;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = a[0][0];
        int mxI =1;
        int mxJ =1;

        for(int i=0; i<9;i++) {
            for (int j = 0; j < 9; j++) {
               if(a[i][j]>max) {
                   max= a[i][j];
                   mxI = i+1;
                   mxJ = j+1;
               }
            }
        }
        System.out.println(max);
        System.out.print(mxI+ " " +mxJ);
    }
}
