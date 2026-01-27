package com.alpaca.coTe.stack_queue_deque_1;

import java.util.*;

public class B11866_요세푸스_문제0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=n; i++){
            que.add(i);
        }
        sb.append("<");

        while(que.size()>1){

            for(int i=1; i<k; i++){
                que.add(que.poll());
            }
            sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll()).append(">");

        System.out.println(sb);
    }
}
