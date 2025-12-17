package com.alpaca.coTe.math2;

import java.util.Scanner;

public class B11653_소인수분해 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=2;

        while (true){

            if(n ==1){
                System.exit(0);
            }
            if(n%i == 0){
                System.out.println(i);
                n = n/i;
            } else {i++;}
        }


    }
}
