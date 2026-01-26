package com.alpaca.coTe.stack_queue_deque_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18258_큐2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] queue = new int[n];
        int idx = 0;
        int fr = 0;
        StringBuilder sb = new StringBuilder();

        while(n --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command){
                case "push":
                    int a = Integer.parseInt(st.nextToken());
                    queue[idx++] = a;
                    break;
                case "pop" :
                    if(idx == 0 || fr == idx){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(queue[fr]).append("\n");
                        fr++;}
                    break;
                case "size":
                    sb.append(idx-fr).append("\n");
                    break;
                case "empty" :
                    if(idx == 0 || fr == idx){
                    sb.append(1).append("\n");}
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if(idx == 0|| fr == idx){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue[fr]).append("\n");
                    }
                    break;
                case "back" :
                    if(idx == 0|| fr == idx){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue[idx-1]).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
