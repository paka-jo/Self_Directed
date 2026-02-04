package com.alpaca.coTe.algorithm_basic.bruteFroce_500;

import java.util.Scanner;

public class B1476_날짜_계산 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int i =1;

        if(e ==15) e=0;
        if(s == 28) s =0;
        if(m == 19) m =0;
        while(true){
            if(i %15 == e && i % 28 == s && i % 19 == m){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
