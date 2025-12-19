package com.alpaca.coTe.rectanguleAndTriangle;

import java.util.Arrays;
import java.util.Scanner;

public class B14215_세_막대 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int result =0;

        for(int i=0;i<3;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        if(a[0] + a[1] <= a[2]) {
            result  = (a[0]+a[1])*2 -1;
        } else{ result = a[0] +a[1] + a[2];}
        System.out.println(result);
    }
}
