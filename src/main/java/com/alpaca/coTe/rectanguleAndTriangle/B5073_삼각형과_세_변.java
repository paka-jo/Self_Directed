package com.alpaca.coTe.rectanguleAndTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B5073_삼각형과_세_변 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int[] a = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0; i<3; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);

            if (a[0] == 0 &&a[2] == 0){
                return;
            }

            if(a[0]+a[1] <= a[2]){
                System.out.println("Invalid");
                continue;
            }
            if(a[0] == a[2]){
                System.out.println("Equilateral");
            } else if(a[0] == a[1] || a[1] == a[2] ){
                System.out.println("Isosceles");
            } else{
                System.out.println("Scalene");
            }
        }

    }
}
