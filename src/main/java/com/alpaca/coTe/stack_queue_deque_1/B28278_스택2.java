package com.alpaca.coTe.stack_queue_deque_1;

import java.io.*;
import java.util.StringTokenizer;

public class B28278_스택2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n];
        int idx = 0;

        while(n --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch(command){
                case 1:
                    int val = Integer.parseInt(st.nextToken());
                    stack[idx++] = val;
                    break;
                case 2:
                    if(idx == 0){
                        sb.append(-1).append("\n");
                    } else { sb.append(stack[--idx]).append("\n");}
                    break;
                case 3:
                    sb.append(idx).append("\n");
                    break;
                case 4:
                    if(idx == 0){
                        sb.append(1).append("\n");
                    } else{
                        sb.append(0).append("\n");
                    }
                    break;
                case 5:
                    if(idx != 0){
                        sb.append(stack[idx-1]).append("\n");
                    } else {sb.append(-1).append("\n");}
                    break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
