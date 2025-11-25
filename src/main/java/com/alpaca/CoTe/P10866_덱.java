package com.alpaca.CoTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P10866_덱 {

    static Deque<Integer> deq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String command = br.readLine();
            deque(command);
        }
    }

    private static void deque(String command) {
        String[] com = command.split(" ");
        String c = com[0];

        switch (c) {
            case "push_front":
                int a = Integer.parseInt(com[1]);
                deq.addFirst(a);
                break;
            case "push_back":
                int b = Integer.parseInt(com[1]);
                deq.addLast(b);
                break;
            case "pop_front":
                if(deq.isEmpty()){
                    System.out.println(-1);
                } else System.out.println(deq.pollFirst());
                break;
            case "pop_back":
                if(deq.isEmpty()){
                    System.out.println(-1);
                } else System.out.println(deq.pollLast());
                break;
            case "size":
                System.out.println(deq.size());
                break;
            case "empty":
                if(deq.isEmpty()) {
                    System.out.println(1);}
                else System.out.println(0);
                break;
            case "front":
                if(deq.isEmpty()){
                    System.out.println(-1);
                }else System.out.println(deq.getFirst());
                break;
            case "back":
                if(deq.isEmpty()){
                    System.out.println(-1);
                }else System.out.println(deq.getLast());
                break;
        }
    }
}
