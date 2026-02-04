package com.alpaca.coTe.algorithm_basic.bruteFroce_500;

import java.util.Arrays;
import java.util.Scanner;

public class B2309_일곱_난쟁이 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] sta = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sta[i] = sc.nextInt();
            sum += sta[i];
        }

        Arrays.sort(sta);

        int a=0; int b=0;

        for(int i=0; i<sta.length; i++){
            for(int j=i+1; j< sta.length; j++){
                if(sum - sta[i]- sta[j] == 100){
                    a=i;
                    b=j;
                    break;
                }
            }
        }

        for(int i=0; i<sta.length; i++){
            if(i!=a && i !=b){
                System.out.println(sta[i]);
            }
        }
    }
}
