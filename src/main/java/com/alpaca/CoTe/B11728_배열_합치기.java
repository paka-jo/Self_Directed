package com.alpaca.CoTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11728_배열_합치기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        int i=0;
        int j=0;

        StringBuilder sb = new StringBuilder();

        while(i < n && j < m){
            if(a[i]< b[j]){
                sb.append(a[i++]).append(" ");
            }else sb.append(b[j++]).append(" ");
        }

        while(i < n) {
            sb.append(a[i++]).append(" ");
        }

        while(j < m) {
            sb.append(b[j++]).append(" ");
        }
        System.out.print(sb);

    }
}
