package com.alpaca.coTe.Divisors_multiple_prime_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1934_최소공배수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int x =1;
            int y =1;

            while(true) {

                if(a*x>b*y){
                    y++;
                } else if(a*x<b*y) {
                    x++;
                } else {
                    sb.append(a*x).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
