package com.alpaca.coTe.rectanguleAndTriangle;

import java.util.Scanner;

public class B10101_삼각형_외우기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b+c != 180){
            System.out.println("Error");
           return;
        }
        if(a == 60 && b == 60 && c == 60 ){
            System.out.println("Equilateral");
        }else if(a == b || a == c || b == c){
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }



    }
}
