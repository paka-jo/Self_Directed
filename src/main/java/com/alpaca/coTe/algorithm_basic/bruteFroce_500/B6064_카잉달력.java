package com.alpaca.coTe.algorithm_basic.bruteFroce_500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B6064_카잉달력 {

    static int t;
    static int n;
    static int m;
    static int x;
    static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());



        for(int i =0;i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken()) -1;
            y = Integer.parseInt(st.nextToken()) -1;
            boolean check= false;

            for(int j=x; j<(n*m); j += n){
                if(j%m == y){
                    System.out.println(j+1);
                    check = true;
                    break;
                }
           }
            if(!check){
            System.out.println(-1);}

        }

    }
}
