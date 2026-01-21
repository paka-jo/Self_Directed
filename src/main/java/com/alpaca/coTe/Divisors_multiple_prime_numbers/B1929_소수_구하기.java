package com.alpaca.coTe.Divisors_multiple_prime_numbers;

import java.util.Scanner;

public class B1929_소수_구하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=n; i<=m; i++){
            if(i == 1){continue;}
            if(i <=3){
                sb.append(i).append("\n");
                continue;
            }

            int cnt = 0;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    cnt++;
                    break;
                }
            }
            if (cnt == 0){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
