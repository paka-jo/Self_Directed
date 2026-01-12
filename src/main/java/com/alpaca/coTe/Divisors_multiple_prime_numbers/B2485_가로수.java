package com.alpaca.coTe.Divisors_multiple_prime_numbers;

import java.util.Scanner;

public class B2485_가로수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tmp = new int[n];

        for (int i = 0; i < n; i++) {
            tmp[i] = sc.nextInt();
        }

        int gcdVal = tmp[1]-tmp[0];

        for(int i =0; i<n-1;i++){
            int dis = tmp[i+1]-tmp[i];
            gcdVal = gcd(gcdVal,dis);
        }

        int result = ((tmp[n-1] - tmp[0])/gcdVal + 1) - n;

        System.out.println(result);
    }

    static int gcd (int a,int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b,a%b);
    }
}
