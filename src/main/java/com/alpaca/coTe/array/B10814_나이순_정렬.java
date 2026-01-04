package com.alpaca.coTe.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10814_나이순_정렬 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr,((o1, o2) -> {
            if(o1 != o2){
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            } return 0;
        }));

        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i][0]).append(" ").append(arr[i][1]);
            System.out.println(sb);
        }
    }
}
