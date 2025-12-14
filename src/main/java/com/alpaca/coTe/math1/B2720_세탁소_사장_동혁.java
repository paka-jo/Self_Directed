package com.alpaca.coTe.math1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B2720_세탁소_사장_동혁 {

    /*
     * 쿼터 0.25 달러
     * 다임 0.10 달러
     * 니켈 0.05 달러
     * 페니 0.01 달러
     *
     * ex) 124 = 4쿼터 2 다임 4 페니 ==> 124 == 1.24달러
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = {25, 10, 5, 1};  //거스름돈 단위*100

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                if (x / a[j] != 0) {
                    sb.append(x / a[j]).append(" ");
                    x = x % a[j];
                } else {
                    sb.append(0).append(" ");

                }
            }
            System.out.println(sb);
        }

    }
}

