package com.alpaca.coTe.algorithm_basic.bruteForce_530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1759_암호_만들기 {

    static int n = 0;
    static int m = 0;
    static char[] alp;
    static char[] arr;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        alp = new char[m];
        arr = new char[n];
        isUsed = new boolean[m];

        st = new StringTokenizer(br.readLine());
        for(int i =0;i<m; i++){
            alp[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(alp);

        word(0,0);

        System.out.println(sb);
    }

    static void word(int dept,int start){
        if (n == dept) {
            int vowel = 0;
            int consonant = 0;

            for (char x : arr) {
                if (isVowel(x)) vowel++;
                else consonant++;
            }

            if (vowel >= 1 && consonant >= 2) {
                for (int i = 0; i < n; i++) {
                    sb.append(arr[i]);
                }
                sb.append('\n');
            }
            return;
        }
        for(int i=start; i<m; i++){
                arr[dept] = alp[i];
                word(dept +1,i+1);
            }
        }
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
