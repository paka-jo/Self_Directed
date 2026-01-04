package com.alpaca.coTe.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10815_숫자카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int[] arrN = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
            map.put(arrN[i],1);
        }

        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int a : arrM) {
            if (map.containsKey(a)) {
                sb.append("1 ");
            }else sb.append("0 ");
        }
        System.out.println(sb);
    }
}