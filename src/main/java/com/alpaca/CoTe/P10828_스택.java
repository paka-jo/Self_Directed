package com.alpaca.CoTe;

import java.io.*;
import java.util.Stack;

public class P10828_스택 {

    static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String command = br.readLine();
            stack(command);
        }
    }

    private static void stack(String command) {
        String[] com = command.split(" ");
        String c = com[0];

        switch (c) {
            case "push":
                int a = Integer.parseInt(com[1]);
                st.push(a);
                break;
            case "pop":
                if(st.empty()){
                    System.out.println(-1);
                } else {System.out.println(st.peek());
                    st.pop();}
                break;
            case "size":
                System.out.println(st.size());
                break;
            case "empty":
                if(st.empty()){
                    System.out.println(1);;
                }else{
                    System.out.println(0);
                }
                break;
            case "top":
                if(st.empty()){
                    System.out.println(-1);
                } else System.out.println(st.peek());
                break;
        }
    }
}
