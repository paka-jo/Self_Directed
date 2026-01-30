package com.alpaca.coTe.stack_queue_deque_1;

import java.io.*;
import java.util.*;

public class B24511_queuestack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter sw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> data = new ArrayDeque<>();
        Deque<Integer> qDeque= new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n ;i++){
            data.addLast(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int a : data){
            int num = Integer.parseInt(st.nextToken());
            if(a == 0){
                qDeque.add(num);
            }
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m ;i++){
            qDeque.offerFirst(Integer.parseInt(st.nextToken()));
            sb.append(qDeque.pollLast()).append(' ');
        }
        sw.write(sb.toString());
        sw.flush();
        sw.close();
        br.close();
    }


    // 첫번째 풀이,시간초과
    /*public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter sw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] data = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n ;i++){
            num[i] =Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n ;i++){
            data[i] =Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] plusNum = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m ;i++){
            plusNum[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        int j = 0;
        Queue<Integer> queue = new LinkedList<>();
        while(j<m){

            int x1 = plusNum[j];

            for(int i =0; i<n; i++){

                if(num[i] == 0){
                    queue.add(data[i]);
                    queue.add(x1);
                    x1 = queue.poll();
                    data[i] = queue.poll();
                }

            }
            sb.append(x1).append(' ');
            j++;
        }
        sw.write(sb.toString());
        sw.flush();
        sw.close();
    }*/
}
