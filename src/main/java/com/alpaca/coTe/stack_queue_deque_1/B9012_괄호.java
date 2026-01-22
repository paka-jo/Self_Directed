package com.alpaca.coTe.stack_queue_deque_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B9012_괄호 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            String input = st.nextToken();
            Stack<Character> stack = new Stack<>();

            boolean isVPS = true;

            for(int j=0; j<input.length(); j++){
                char c = input.charAt(j);

                if(c == '('){
                stack.push(c);
                } else if(c == ')'){
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty()){
                isVPS = false;
            }

            if(isVPS){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
