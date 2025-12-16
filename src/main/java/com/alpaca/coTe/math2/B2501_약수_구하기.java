package com.alpaca.coTe.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2501_약수_구하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] a = new Integer[n];

        int i =0;
        int j =0;

        while(i != n){
            i++;
            if(n%i == 0){
                a[j] = i;
                j++;
            }
        }

        if(a[k-1] == null ){
            System.out.println(0);
        } else System.out.println(a[k-1]);
    }
}
