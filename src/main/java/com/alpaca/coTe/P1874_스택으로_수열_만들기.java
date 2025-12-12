package com.alpaca.coTe;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택으로_수열_만들기 {
    /*
    * 수열의 개수: n
    * 수열을 이루는 정수
    * push: +*, pop:- 불가능:No
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num =1;
        boolean result = true;
        StringBuilder bf = new StringBuilder();
        for (int i=0; i<A.length; i++) {
            int su = A[i];
            if(su >= num) {
                while (su>=num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else {
                int n = stack.pop();
                if(n>su) {
                    System.out.println("No");
                    result = false;
                    break;
                }else {
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
