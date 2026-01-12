package com.alpaca.coTe.Divisors_multiple_prime_numbers;

import java.util.Scanner;

public class B1735_분수의_합 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long[] a = new long[2];
        long[] b = new long[2];

        for(int i=0; i<2; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        long n = a[0]*(lcm(b[0],b[1])/b[0]) + a[1]*(lcm(b[0],b[1])/b[1]);//분자
        long m = lcm(b[0],b[1]);// 분모

        if(gcd(m,n) > 1){
            System.out.println(n/gcd(m,n)+ " "+ m/gcd(m,n));
        } else System.out.println(n + " " + m);
    }

    static long gcd(long n,long m){
        if(n%m == 0){
            return m;
        }
        return gcd(m,n%m);
    }

    static long lcm (long n, long m){
        return n*m/gcd(n,m);
    }
}
