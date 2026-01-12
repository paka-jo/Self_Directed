package com.alpaca.coTe.Divisors_multiple_prime_numbers;

import java.util.Scanner;

public class B13241_최소공배수 {

    static long n;
    static long m;

    // 뉴클리드 호제법
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n= sc.nextInt();
        m= sc.nextInt();

        System.out.println(lcm(n,m));

    }

    static long gcd(long a,long b){
        if(a%b == 0)
            return b;
        return gcd(b,a%b);
    }

    static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }

}
