package com.alpaca.coTe;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {

    static int n,m;
    static int[] dx ={1,0,-1,0};
    static int[] dy ={0,1,0,-1};
    static boolean[][] visited;
    static int[][] map;

    public static void bfs(int x, int y) {

        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;

        while (!q.isEmpty()) {

            int[] p = q.poll();
            int px = p[0];
            int py = p[1];

            for(int d=0; d<4; d++){
                int nx = px+dx[d];
                int ny = py+dy[d];

                if(nx<0 || ny<0 || nx >= n || ny >= m) continue;

                if( visited[nx][ny] || map[nx][ny] != 1) continue;

                visited[nx][ny] = true;
                q.add(new int[] {nx,ny});
            }
        }
    }
}
