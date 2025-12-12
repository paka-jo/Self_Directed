package com.alpaca.coTe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178_미로_탐색 {

    static int n,m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = s.charAt(j) - '0';
            }
        }
        visited = new boolean[n][m];
        int length = 0;

        bfs(0,0);

        System.out.println(map[n-1][m-1]);
    }

    private static void bfs(int x, int y) {
        Queue<int []> q= new LinkedList<>();
        q.add(new int[] {x,y});
        visited[x][y] = true;

        while(!q.isEmpty()) {
            int[] p = q.poll();
            int px = p[0];
            int py = p[1];

            for(int d=0; d<4; d++) {
                int nx = px+dx[d];
                int ny = py+dy[d];

                if(nx<0 || ny<0|| nx>=n || ny>=m) continue;
                if(visited[nx][ny] || map[nx][ny] != 1) continue;

                visited[nx][ny] = true;
                map[nx][ny] = map[px][py] + 1;
                q.add(new int[] {nx,ny});
            }
        }
    }
}
