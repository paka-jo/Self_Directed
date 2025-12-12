package com.alpaca.coTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15688_수_정렬하기 {
    /*
    countingSort*/
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] count = new int[2000001];

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num+1000000]++;
        }

        for(int i=0; i<count.length; i++) {
            while (count[i] > 0) {
                sb.append(i - 1000000).append('\n');
                count[i]--;
            }
        }

        System.out.print(sb);

    }

    /* 내 풀이
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] a= new int[n];
        for(int i =0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int i=0;
        Arrays.sort(a);
        while(i <n){
        sb.append(a[i++]).append(" ");}
        System.out.println(sb);
    }
     */

}
