package com.alpaca.coTe.math1;

import java.util.Scanner;

public class B2903_중앙_이동_알고리즘 {

    public static void main(String[] args) {

        /*
        * 정사각형 한 변의 모서리 수 : 2^n +1
        * */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println((int) Math.pow((Math.pow(2,n) +1),2));

    }
}
