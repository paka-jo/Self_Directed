package com.alpaca.coTe.algorithm_basic.graph_1_600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B13023_ABCDE {

    static int n;
    static int m;
    static int[][] relation;
    static boolean[] used;
    static ArrayList<Integer>[] arr;
    static boolean found;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //사람수
        m = Integer.parseInt(st.nextToken()); //친구 관계 수

        relation = new int[m][2];
        used = new boolean[n];
        arr = new ArrayList[n];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            relation[i][0] = Integer.parseInt(st.nextToken());
            relation[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = relation[i][0];
            int v = relation[i][1];
            arr[u].add(v);
            arr[v].add(u);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 0);
            if (found) break;
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 0);
            if (found) break;
        }

        if(found){
            System.out.println(1);
        } else{System.out.println(0);}

    }

    static void dfs(int current, int dept){
        if(dept == 4){
                found = true;
                return;
            }

        used[current] = true;

        for(int next : arr[current]){
            if(!used[next]){
                dfs(next,dept +1);
                if(found) return;
            }
        }
        used[current] = false;


    }
}
