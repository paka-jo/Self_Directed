package com.alpaca.coTe.stack_queue_deque_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2346_풍선_터트리기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            deque.offerLast(new int[]{i,Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();

        while(!deque.isEmpty()){
            int[] data = deque.removeFirst();

            sb.append(data[0]+1).append(' ');

            if(deque.isEmpty()) break;

            if(data[1]> 0){
                for(int i =0; i< data[1]-1; i++){
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for(int i=0; i<Math.abs(data[1]);i++){
                    deque.offerFirst(deque.pollLast());
                }
            }
        }
        System.out.println(sb);

    }
}
