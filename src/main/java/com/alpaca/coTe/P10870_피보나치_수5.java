package com.alpaca.coTe;

import java.util.Scanner;

public class P10870_피보나치_수5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n-1) +fibonacci(n-2);
    }

        /*public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            if (n == 0) {
                System.out.println(0);
                return;
            }

            int[] fn = new int[n+1];
            fn[0] = 0;
            fn[1] = 1;

            for(int i=2; i<=n; i++) {
                fn[i] = fn[i-1] + fn[i-2];
            }
            System.out.println(fn[n]);
        }*/
}



