package com.alpaca.coTe.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B1764_듣보잡 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> name = new HashSet<>();
        for(int i= 0; i<n; i++){
            String a = br.readLine();
            name.add(a);
        }

        ArrayList<String> same = new ArrayList<>();
        int cnt = 0;
        for(int i=0; i<m; i++){
            String cw = br.readLine(); //보도 못한 사람
            if(name.contains(cw)){
                cnt++;
                name.remove(cw);
                same.add(cw);
            }
        }
        Collections.sort(same);
        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append("\n");
        for(int i=0; i<same.toArray().length; i++){
            sb.append(same.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
