package com.alpaca.coTe.math2;

import java.util.ArrayList;
import java.util.Scanner;

public class B9506_약수들의_합 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            int sum = 0;

            if (a == -1) {
                break;
            }

            for (int i = 1; i < a / 2 + 1; i++) {
                if (a % i == 0) {
                    list.add(i);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
                sb.append(list.get(i));

                if(i<list.size() -1){
                    sb.append(" + ");
                }
            }

            if (a == sum) {
                System.out.println(a + " = " + sb);
            } else {
                System.out.println(a + " is NOT perfect.");
            }

        }
    }
}
