package com.alpaca.coTe.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B14425_문자열_집합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] str = new String[n];
        Set<String> set = new HashSet<>();

        for(int i=0;i<n; i++){
            str[i] = br.readLine();
            set.add(str[i]);
        }

        int count =0;

        for(int i=0;i<m; i++){
            if(set.contains(br.readLine())){
                count++;
            }
        }

        System.out.println(count);
    }
}
