package com.alpaca.coTe.algorithm_basic.bruteForce_540;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B11723_집합 {

    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            String command = br.readLine();
            set(command);
        }

        System.out.println(sb);

    }

    static void set(String command){
        String[] com = command.split(" ");
        String c = com[0];
        switch (c) {
            case "add" :
                int x = Integer.parseInt(com[1]);
                if(!list.contains(x)){
                    list.add(x);
                }
                break;
            case "remove" :
                x = Integer.parseInt(com[1]);
                if(list.contains(x)){
                    int idx = list.indexOf(x);
                    list.remove(idx);
                }
                break;
            case "check" :
                x = Integer.parseInt(com[1]);
                if (list.contains(x)) {
                    sb.append(1).append('\n');
                } else {sb.append(0).append('\n');;}
                break;
            case "toggle" :
                x = Integer.parseInt(com[1]);
                if (list.contains(x)) {
                    int idx = list.indexOf(x);
                    list.remove(idx);
                } else {
                   list.add(x);
                }
                break;
            case "all":
                list.clear();
                for(int i=1; i<=20; i++) {
                    list.add(i);
                }
                break;
            case "empty":
                list.clear();
        }


    }
}
