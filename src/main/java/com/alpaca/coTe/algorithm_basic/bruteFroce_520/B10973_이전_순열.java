package com.alpaca.coTe.algorithm_basic.bruteFroce_520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10973_이전_순열 {

    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i= 0; i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        int i=n-1;
        while(i>0 &&num[i-1] <= num[i]){
            i--;
        }

        if( i <= 0){
            System.out.println("-1");
            return;
        }

        int j = n-1;
        while(num[j] >= num[i-1]){
            j--;
        }

        swap(i-1, j);

        int start = i;
        int end = n-1;
        while(start<end){
            swap(start,end);
            start++;
            end--;
        }

        for(int val : num){
            sb.append(val).append(' ');
        }
        System.out.println(sb);

    }

    static void swap(int a, int b){
        int tmp = num[a];
        num[a] = num[b];
        num[b] = tmp;
    }
}
