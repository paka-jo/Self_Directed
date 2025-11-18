package com.alpaca.CoTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2750_버블정렬 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] K = new int[N];

        for(int i=0; i<N; i++) {
            K[i] = Integer.parseInt(br.readLine());
        }
        for(int i =0; i<N-1; i++) {
            for (int j=0; j<N-1-i; j++) {
                if(K[j]>K[j+1]){
                    int temp = K[j];
                    K[j] = K[j+1];
                    K[j+1]= temp;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(K[i]);
        }
    }
}
