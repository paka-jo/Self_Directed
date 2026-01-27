package com.alpaca.coTe.stack_queue_deque_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B28279_덱2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int com = Integer.parseInt(st.nextToken());

            switch (com) {
                case 1:
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (deque.isEmpty()) sb.append("-1\n");
                    else sb.append(deque.pollFirst()).append("\n");
                    break;
                case 4:
                    if (deque.isEmpty()) sb.append("-1\n");
                    else sb.append(deque.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if (deque.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case 7:
                    if (deque.isEmpty()) sb.append("-1\n");
                    else sb.append(deque.peekFirst()).append("\n");
                    break;
                case 8:
                    if (deque.isEmpty()) sb.append("-1\n");
                    else sb.append(deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

//첫번쨰 구현한 코드 (시간 초과, case 1 구현 방식 때문인거 같음 , 추후 덱 안쓰고 다시한번 더 구현 예정
//    public static void main(String[] args) {
//
//    }
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] deque = new int[n];
//        int idx = 0;
//        int fr = 0;
//
//        StringBuilder sb = new StringBuilder();
//
//        while(n --> 0){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int com = Integer.parseInt(st.nextToken());
//
//            switch (com) {
//                case 1 :
//                    int a = Integer.parseInt(st.nextToken());
//                    Queue<Integer> que = new LinkedList<>();
//                    for(int i=0; i<idx; i++){
//                        que.add(deque[i]);
//                    }
//                    deque[0] = a;
//                    for(int i=1; i<idx+1; i++){
//                        deque[i] = que.poll();
//                    }
//                    idx++;
//                    break;
//                case 2 :
//                    int b = Integer.parseInt(st.nextToken());
//                    deque[idx] = b;
//                    idx++;
//                    break;
//                case 3 :
//                    if( idx == 0 || fr == idx ){
//                        sb.append(-1).append("\n");
//                    } else sb.append(deque[fr]).append("\n");
//                    fr++;
//                    break;
//                case 4 :
//                    if( idx == 0 || fr == idx ){
//                        sb.append(-1).append("\n");
//                    } else sb.append(deque[idx-1]).append("\n");
//                    idx--;
//                    break;
//                case 5 :
//                    sb.append(idx-1).append("\n");
//                    break;
//                case 6 :
//                    if(idx == 0 || fr == idx){
//                        sb.append(1).append("\n");
//                    } else sb.append(0).append("\n");
//                    break;
//                case 7:
//                    if(idx == 0 || fr == idx){
//                        sb.append(-1).append("\n");
//                    }else sb.append(deque[fr]).append("\n");
//                    break;
//                case 8:
//                    if(idx == 0 || fr == idx){
//                        sb.append(-1).append("\n");
//                    }else sb.append(deque[idx-1]).append("\n");
//                    break;
//            }
//        }
//        System.out.println(sb);
//
//    }
}
