package com.alpaca.coTe.stack_queue_deque_1;

import java.util.Scanner;
import java.util.Stack;

public class P4949_균형잡힌_세상 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true) {
            String input = sc.nextLine();
            Stack<Character> stack = new Stack<>();

            if(input.equals(".")) {
                break;
            }

            boolean isValid = true;

            for(int i=0; i<input.length(); i++) {
                char c = input.charAt(i);

                if (c == '(' || c == '[') stack.push(c);

                if (c == ')') {
                    if (stack.empty() || stack.peek() == '[') {
                        isValid = false;
                        break;
                    } else{
                        stack.pop();
                    }
                }

                if (c == ']') {
                    if (stack.empty() || stack.peek() == '(') {
                        isValid = false;
                        break;
                    } else{
                        stack.pop();
                    }
                }
            }

                if(!isValid || !stack.empty()){
                    System.out.println("no");
                } else System.out.println("yes");

        }

    }
}
