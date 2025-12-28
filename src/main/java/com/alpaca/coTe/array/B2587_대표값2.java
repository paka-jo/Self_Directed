package com.alpaca.coTe.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2587_대표값2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum =0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>100) {
                break;
            }
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}
