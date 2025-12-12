package com.alpaca.coTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B11652_카드 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] tmp = new long[n];

        for (int i = 0; i < n; i++) {
            tmp[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(tmp);

        int cnt = 0;
        long mxVal = (long) (-Math.pow(2, 62)- 1);
        int mxCnt = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || tmp[i - 1] == tmp[i]) {
                cnt++;
            } else {
                if (cnt > mxCnt) {
                    mxCnt = cnt;
                    mxVal = tmp[i - 1];
                }
                cnt = 1;
            }
        }
        if (cnt > mxCnt) {
            mxVal = tmp[n - 1];
        }
        System.out.println(mxVal);
    }
}
