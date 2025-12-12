package com.alpaca.coTe;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P10845_큐 {

    static Queue<Integer> que = new LinkedList<>();
    static int last = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String command = br.readLine();
            queue(command);
        }
    }

    private static void queue (String command) {
        String[] com = command.split(" ");
        String c = com[0];

        switch (c) {
            case "push":
                int a = Integer.parseInt(com[1]);
                last = a;
                que.add(a);
                break;
            case "pop":
                if(que.peek() == null){
                    System.out.println(-1);
                }else System.out.println(que.poll());
                break;
            case "size":
                System.out.println(que.size());
                break;
            case "empty":
                if(que.peek() == null){
                    System.out.println(1);
                } else System.out.println(0);
                break;
            case "front":
                if(que.peek() == null) {
                    System.out.println(-1);
                } else System.out.println(que.peek());
                break;
            case "back":
                if(que.peek() == null) {
                    System.out.println(-1);
                } else System.out.println(last);
                break;
        }
    }
}
