package com.alpaca.coTe.algorithm_basic.bruteFroce_500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1107_리모컨 {

    static int n;
    static int m;
    static List<Integer> remo = new ArrayList<>();
    static int min = Integer.MAX_VALUE;
    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n  = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        for(int i=0; i<=9; i++) {
        remo.add(i);
        }
        if(m>0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<m;i++){
            int a = Integer.parseInt(st.nextToken());
            remo.remove(Integer.valueOf(a));}
        }else {br.readLine();}

        min = Math.abs(n - 100);
        int oriLength = String.valueOf(n).length();
        for(int i = oriLength-1; i<=oriLength +1; i++){
            if(i>0){
                length = i;
                dfs(0,0);
            }
        }

        System.out.println(min);
    }

    static void dfs(int dept,int cur){
        if(dept == length) {
            int count = Math.abs(n-cur) + length;
            min = Math.min(min,count);
            return;
        }
        for(int i=0;i<remo.size(); i++){
            dfs(dept+1,cur*10 + remo.get(i));
        }
    }

}
