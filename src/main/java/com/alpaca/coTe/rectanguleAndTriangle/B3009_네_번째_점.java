package com.alpaca.coTe.rectanguleAndTriangle;

import java.util.Arrays;
import java.util.Scanner;

public class B3009_네_번째_점 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for(int i=0; i<3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        int countX =0;
        int countY =0;
        int i= 1;
        while(i<3){
            if(x[0] != x[i]){
                countX++;
            }
            if(y[0] != y[i]){
                countY++;
                i++;
            }
            else i++;
        }

        int a=0;
        if(countX ==1){
            a = x[2];
        } else a= x[0];

        int b=0;
        if(countY ==1){
            b = y[2];
        } else b= y[0];

        System.out.println(a + " "+ b);
    }
}
