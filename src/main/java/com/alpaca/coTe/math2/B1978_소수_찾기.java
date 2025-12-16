package com.alpaca.coTe.math2;

import java.util.Scanner;

public class B1978_소수_찾기 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result =0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int count =0;
            for(int j=1; j<a+1; j++){
                if(a%j ==0){
                    count++;
                }
            }
            if(count == 2){
                result++;
            }
        }
        System.out.println(result);
    }
}
