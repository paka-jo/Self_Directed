package com.alpaca.coTe.stack_queue_deque_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773_제로 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        long sum = 0;

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);

    }
}
