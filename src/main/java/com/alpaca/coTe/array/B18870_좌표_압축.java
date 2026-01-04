package com.alpaca.coTe.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
public class B18870_좌표_압축 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] tmp = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            tmp[i] = arr[i];
        }

        Arrays.sort(tmp);

        int i=0;
        for(int a: tmp){
            if(!map.containsKey(a))
                map.put(a, i++);
        }

        StringBuilder sb = new StringBuilder();
        for(int a:arr){
            sb.append(map.get(a)+ " ");
        }

        System.out.println(sb);
    }
}
