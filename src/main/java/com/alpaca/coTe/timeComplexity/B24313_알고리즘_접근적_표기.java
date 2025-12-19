package com.alpaca.coTe.timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24313_알고리즘_접근적_표기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        if ((a1 * d + a0 <= c * d) && (a1 <= c)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
