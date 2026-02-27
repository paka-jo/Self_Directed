package com.alpaca.coTe.algorithm_basic.bruteFroce_520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10819_차이를_최대로 {

    static int n;
    static int max = 0;
    static boolean[] isUsed;
    static int[] num;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        num = new int[n];
        isUsed = new boolean[n];
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);
        dfs(0);

        System.out.println(max);

    }

    static void dfs(int dept) {
        if (dept == n) {
            int sum = 0;
            for(int i = 0; i<n-1; i++) {
               sum += Math.abs(arr[i] - arr[i+1]);
            }
            max = Math.max(max, sum);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                arr[dept] = num[i];
                dfs(dept + 1);
                isUsed[i] = false;
            }
        }
    }
}