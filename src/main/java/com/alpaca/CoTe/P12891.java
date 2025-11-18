package com.alpaca.CoTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {

    static int myArr[];
    static int basicArr[];
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        /*
        문자열의 길이 :S
        부분문자열의 길이:P
        * DNA 문자열 : `A`,`C`,`G`,`T`
        * 문자의 특정 개수: N*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        basicArr = new int[4];
        myArr = new int[4];
        char[] A = new char[S];
        checkSecret =0;


        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            basicArr[i] = Integer.parseInt(st.nextToken());
            if(basicArr[i] == 0) {
                checkSecret++;
            }
        }

        for(int i=0; i<P; i++) {
            Add(A[i]);
        }

        if (checkSecret == 4) result++;

        for(int i=P; i<S; i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) result++;
        }
        System.out.println(result);
        br.close();

    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(basicArr[0] == myArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(basicArr[1] == myArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(basicArr[2] == myArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(basicArr[3] == myArr[3]) checkSecret++;
                break;


        }

    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(basicArr[0] == myArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(basicArr[1] == myArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(basicArr[2] == myArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(basicArr[3] == myArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }

    }
}
