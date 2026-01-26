package com.alpaca.coTe.stack_queue_deque_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B12789_도키도키_간식드리미 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> que = new LinkedList<>();

        Stack<Integer> lowNum = new Stack<>();
        Stack<Integer> highNum = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            que.add(Integer.parseInt(st.nextToken()));
        }

        lowNum.add(0);

        while(!que.isEmpty()){

            while(!highNum.isEmpty() && highNum.peek() == lowNum.lastElement() +1){
                lowNum.add(highNum.pop());
            }

            int num = que.poll();
            if( num == lowNum.lastElement()+1){
                lowNum.add(num);
            } else{
                highNum.add(num);
            }
        }

        while(!highNum.isEmpty()){
            int num = highNum.pop();
            lowNum.add(num);
        }

        while(lowNum.peek() != 0){
            int num = lowNum.pop();
            if(num == lowNum.peek()+1){
                continue;
            }else {
                System.out.println("Sad");
                break;
            }
        }
        if(lowNum.peek() == 0) {
            System.out.println("Nice");
        }
    }
}


