package com.alpaca.coTe.math1;

import java.util.Scanner;

public class B2292_벌집 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 1;
        int i = 1;
        while(true){
            if(sum<n){
                sum += 6*i;
                i++;}
            else {break;}
            }
        System.out.println(i);
        }

}
