package com.alpaca.CoTe.two_Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10798_세로읽기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] word = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String a = br.readLine();
            for (int j = 0; j < a.length(); j++) {
                word[i][j] = a.charAt(j);
            }
            if (a.length() > max) max = a.length();
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < 5; i++) {
                if (word[i][j] != '\0') {
                    sb.append(word[i][j]);
                }
            }
        }

        System.out.println(sb);
    }
}

