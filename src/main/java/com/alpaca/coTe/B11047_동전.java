package com.alpaca.coTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B11047_동전 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] coins = new Integer[n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            coins[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coins, Collections.reverseOrder());

        int count = 0;
        for(int coin : coins){
            count += (k/coin);
            k %= coin;
        }
        System.out.println(count);
    }
}
