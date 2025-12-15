package com.alpaca.coTe.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869_달팽이는_올라가고_싶다 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int targetHeight = v - a; // 마지막 올라가는 길이 제외
        int up = a - b; // 하루 올라간 양
        int day = 0;


        if(targetHeight>0){
            day = (targetHeight + up -1)/up + 1;
        } else {day =1;}
        System.out.println(day);

    /* 시간 초과
        while(v > 0){
            if(v-a>=0){
                v -= (a-b);
                count++;
            }
        }
    */
    }
}
