package com.alpaca.coTe.setAndMap;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1620 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        String[] nameArr = new String[n+1];

        for(int i=1; i<=n; i++){
            String name = br.readLine();
            map.put(name,i);
            nameArr[i] = name;
        }

        for(int i = 0; i < m; i++) {
            String input = br.readLine();

            if(map.containsKey(input)){
                sb.append(map.get(input)).append("\n");
            } else {
                int index = Integer.parseInt(input);
                sb.append(nameArr[index]).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

        /* 시간 초과2
        시간 초과 이유: contains 및 indexOf 모두 O(n) 따라서 M개의 문제마다 N개 탐색 최대 100000*100000번 연산
        ArrayList<String> list = new ArrayList<>();

        for(int i =0; i<n; i++) {
            list.add(br.readLine());
        }

        for(int i=0; i<m; i++) {
            String a = br.readLine();;
            if(list.contains(a)) {
                sb.append(list.indexOf(a)+1).append("\n");
            }else {
                sb.append(list.get(Integer.parseInt(a)-1)).append("\n");}
        }
        bw.write(String.valueOf(sb));
        bw.close();
        */

        /* 시간초과
        이유: else의 for문으로 최대 100억번 연산
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(br.readLine(),i+1);
        }

        for(int i=0; i<m; i++){
            String a = br.readLine();
            if(map.containsKey(a)){
                System.out.println(map.get(a));
            } else{
                for(String name : map.keySet()){
                    if(map.get(name).equals(Integer.parseInt(a)) ){
                        System.out.println(name);
                    }
                }

         */
        }


    }

