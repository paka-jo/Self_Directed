package com.alpaca.coTe.stack_queue_deque_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164_카드2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> que = new LinkedList<>();

        for(int i =1; i<=n; i++){
            que.add(i);
        }

        while(que.size() != 1){

            que.poll();
            que.add(que.poll());
        }
        System.out.println(que.peek());

    }
}
