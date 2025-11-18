package com.alpaca.CoTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽_twoPointer {

    /*
    *  재료의 개수:N
    *  갑옷을 만드는데 필요한 수:M
    *  N개의 재료들의 고유한 번호의 수:K[n] K[i]+K[j] = M
    * K[i]+K[j] > M; j--;
    * K[i]+K[j] < M; i++;
    * K[i]+K[j] = M; count++, i++, j--
    * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] K = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            K[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(K);
        int count =0;
        int i =0;
        int j = N-1;

        while(i<j){
            if(K[i]+K[j] < M)i++;
            else if(K[i]+K[j]>M)j--;
            else {
                count++;
                i++; j--;
            }
        }
        System.out.println(count);
    }
}
