package com.alpaca.CoTe;

import java.util.HashSet;
import java.util.Scanner;

public class baek3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> a = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            a.add(sc.nextInt() % 42);

        }

        sc.close();
        System.out.println(a.size());

    }
}
