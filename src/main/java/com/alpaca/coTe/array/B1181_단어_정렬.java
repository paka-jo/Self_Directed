package com.alpaca.coTe.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1181_단어_정렬{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr,(o1, o2) -> {
            if(o1.length() != o2.length()){
                return o1.length() - o2.length();
            }
            return o1.compareTo(o2);
        });


        System.out.println(arr[0]);
        for(int i=1; i<n; i++) {
            if(!arr[i].equals(arr[i-1]))
            System.out.println(arr[i]);
        }
    }
}
