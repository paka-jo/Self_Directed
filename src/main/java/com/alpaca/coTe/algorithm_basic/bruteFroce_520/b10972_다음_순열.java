package com.alpaca.coTe.algorithm_basic.bruteFroce_520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b10972_다음_순열 {

    static int n;
    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int tmp = 0;
        int count = 0;
        for(int i=n-1; i>0; i--){
            if(num[i] > num[i-1]){

                int j = n - 1;
                while (num[j] <= num[i - 1]) {
                    j--;
                }

                tmp = num[i-1];
                num[i-1] = num[j];
                num[j] = tmp;

                Arrays.sort(num, i, n);

                count++;
                break;

            }
        }

        if(count == 0){
            System.out.println(-1);
        } else{
            for(int i=0; i<n;i++){
                sb.append(num[i]).append(' ');
            }
            System.out.println(sb);
        }
    }
}
