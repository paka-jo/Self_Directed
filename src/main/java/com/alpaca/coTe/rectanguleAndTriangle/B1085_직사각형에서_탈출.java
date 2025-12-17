package com.alpaca.coTe.rectanguleAndTriangle;

import java.util.Scanner;

public class B1085_직사각형에서_탈출 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minX=0;
        int minY=0;

        if(w-x >=x){
            minX = x;
        } else minX = w-x;

        if(h-y >= y){
            minY = y;
        } else  minY =h-y;

        if(minX>minY){
            System.out.println(minY);
        }else System.out.println(minX);

    }
}
