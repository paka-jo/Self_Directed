package com.alpaca.coTe.array;

import java.io.*;

public class B10989_수_정렬하기3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[x]++;
        }

        int i = 1;
        while (i <= 10000) {

            if(arr[i]>0) {
                for (int j = 0; j < arr[i]; j++) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }
            i++;
        }
        bw.flush();
        bw.close();
    }
}
