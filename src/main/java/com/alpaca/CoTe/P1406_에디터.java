package com.alpaca.CoTe;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class P1406_에디터 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine(); // 처음 입력 단어
        int N = Integer.parseInt(br.readLine()); // 입력받을 수

        LinkedList<Character> list = new LinkedList<>();
        for(int i =0;i<word.length(); i++) {
            list.add(word.charAt(i));
        }

        ListIterator<Character> iter = list.listIterator(list.size());

        for(int i=0; i<N; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L' :
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D' :
                    if(iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case 'B' :
                    if(iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P' :
                    char t = command.charAt(2);
                    iter.add(t);
                    break;
            }
        }

        for (Character chr :list) {
            bw.write(chr);
        }

        bw.flush();
        bw.close();
    }
}
