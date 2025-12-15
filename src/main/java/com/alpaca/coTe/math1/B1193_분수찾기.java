package com.alpaca.coTe.math1;

import java.util.Scanner;

public class B1193_분수찾기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int x = sc.nextInt();
        int sum =0;
        int i=0;
        int a = 0;

        while(true) {
            if(sum-x <0){
                i++;
                sum += i;
            }else {a = sum-x;
                if(i%2 == 0){
                sb.append(i-a).append("/").append(1+a);}
                else sb.append(1+a).append("/").append(i-a);
            break;}
        }
        System.out.println(sb);
    }

}
