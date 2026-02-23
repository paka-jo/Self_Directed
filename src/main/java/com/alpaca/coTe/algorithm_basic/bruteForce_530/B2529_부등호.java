package com.alpaca.coTe.algorithm_basic.bruteForce_530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2529_부등호 {

    static int n;
    static String[] ine;
    static int[] arr;
    static String min = "";
    static String max = "";
    static boolean[] isUsed;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ine = new String[n];
        arr = new int[n+1];
        isUsed = new boolean[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i< n; i++){
            ine[i] = st.nextToken();
        }

        dfs(0);

        System.out.println(max);
        System.out.println(min);

    }

    static void dfs(int dept){

        if(dept == n+1){
            compare();
            return;
        }

        for(int i=0;i<10;i++){
            if(!isUsed[i]) {
                isUsed[i] = true;
                arr[dept] = i;
                dfs(dept + 1);
                isUsed[i] = false;
            }
        }
    }
    static void compare(){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n;i++) {
            if (ine[i].equals("<")){
                if(arr[i]> arr[i+1]) return;
            } else if(ine[i].equals(">")){
                if(arr[i] <arr[i+1]) return;
            }
        }
        for(int i=0; i<=n; i++) {
            sb.append(arr[i]);
        }
        String numStr = sb.toString();

        if(min.equals("") || numStr.compareTo(min)<0){
            min = numStr;
        }
        if(max.equals("") || numStr.compareTo(max)>0){
            max = numStr;
        }

    }
}
