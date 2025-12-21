package com.alpaca.coTe.bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class B2231_분해합 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int length = n.length();
        int N = Integer.parseInt(n);
        int typeStart = N - length*9; // 순회 시작숫자


        ArrayList<Integer> list = new ArrayList<>();

        while (typeStart<=N){

            int Start = typeStart;
            int sum =0;

            while(Start> 0){
                sum += Start%10;
                Start/=10;
            }

            if(N == sum+typeStart){
                list.add(typeStart);
                typeStart++;
            }else {typeStart++;}
        }

        if(list.size() > 0){
        System.out.println(list.get(0));}
        else System.out.println(0);
    }
}
