package com.alpaca.coTe.math1;

import java.util.Scanner;

public class B11005_진법_변환2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Integer.toString(n,b).toUpperCase());
    }
}
