package com.alpaca.coTe.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2798_블랙잭 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] num = new int[n];
        int sum =0;
        ArrayList<Integer> sumList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        for(int i=0; i<n; i++) {
            for(int j= i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    sum = num[i] +num[j] +num[k];
                    if(m>=sum){
                        sumList.add(sum);
                    }
                }
            }
        }

        Collections.sort(sumList);
        System.out.println(sumList.get(sumList.size()-1));
    }
}
