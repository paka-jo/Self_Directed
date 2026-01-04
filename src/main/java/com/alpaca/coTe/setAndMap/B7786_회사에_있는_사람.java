package com.alpaca.coTe.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B7786_회사에_있는_사람 {

    //
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String sta = st.nextToken();

            if (sta.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        ArrayList<String> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String s :list){
            sb.append(s).append("\n");
        }
        System.out.print(sb);

    }

    /* 내가 작성한 코드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String,String> map = new HashMap<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String sta = st.nextToken();
            if(map.containsKey(name)){
                map.remove(name);
            } else {map.put(name, sta);}
        }

        Map<String, String> sortedMapDesc = new TreeMap<>(Collections.reverseOrder());

        sortedMapDesc.putAll(map);
        sortedMapDesc.forEach((key, value) -> {
            System.out.println(key);
        });

    }*/
}
