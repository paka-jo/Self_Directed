package com.alpaca.coTe.algorithm_basic.bruteFroce_500;

import java.util.Scanner;

public class B1748_수이어쓰기1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = String.valueOf(n).length();

        double sum = 0;
        for(int i =0; i<length-1; i++) {
            sum += 9 * (Math.pow(10, i)) * (i+1);
        }
        double a = n - Math.pow(10,length-1);
        sum += a * length + length;

        System.out.println((int) sum);

    }
}
