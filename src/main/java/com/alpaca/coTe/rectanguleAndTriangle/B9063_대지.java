package com.alpaca.coTe.rectanguleAndTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B9063_대지 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[n];

        if(n == 1){
            System.out.println(0);
            System.exit(0);
        }

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);

        int x =0;
        int y= 0;

        x = a[n-1] - a[0];
        y = b[n-1] - b[0];

        System.out.println(Math.abs(x*y));
    }
}
