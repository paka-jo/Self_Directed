package com.alpaca.coTe.array;

import java.util.Arrays;
import java.util.Scanner;

public class B1427_소트인사이드 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str =String.valueOf(n);
        int[] arr = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        Arrays.sort(arr);

        int j = arr.length - 1;
        while(j >= 0){
            System.out.print(arr[j]);
            j--;

        }

    }
}
