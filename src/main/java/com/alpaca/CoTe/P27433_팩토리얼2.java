package com.alpaca.CoTe;

import java.util.*;

public class P27433_팩토리얼2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long sum = 1;

        for(int i =1;i<=N; i++) {
            sum = i*sum;
        }
        System.out.println(sum);
    }
}
