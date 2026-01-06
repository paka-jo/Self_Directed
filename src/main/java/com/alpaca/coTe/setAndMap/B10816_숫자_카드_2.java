package com.alpaca.coTe.setAndMap;

import java.io.*;
import java.util.*;

public class B10816_숫자_카드_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new TreeMap<>();

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(!map.containsKey(a)) {map.put(a,1);}
            else {map.replace(a,map.get(a)+1);}
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int a = Integer.parseInt(st.nextToken());

            if(map.containsKey(a)){
                sb.append(map.get(a)).append(" ");
            } else sb.append(0).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
