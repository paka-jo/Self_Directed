package com.alpaca.coTe.math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2581_소수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = a; i < b + 1; i++) {
            boolean isPrime = true;
            if (i == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    list.add(i);
                }
            }
        }

            int max = 0;
            for (Integer num : list) {
                max += num;
            }

            if(max>0) {
                System.out.println(max);
                System.out.println(list.get(0));
            }else {System.out.println(-1);}
    }
}
