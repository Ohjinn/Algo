package section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class loc{
    int x, y;

    public loc(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class c8_11 {
    static int[][] maze;
    int[] a = {1, 0, -1, 0};
    int[] b = {0, 1, 0, -1};

    private int BFS(loc root) {
        Queue<loc> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                loc cur = Q.poll();
                for(int j = 0; j < 4; j++){
                    int nx = cur.x + a[j];
                    int ny = cur.y + b[j];
                    if(nx>=1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0){
                        if(nx == 7 && ny == 7) return ++L;
                        maze[nx][ny] = 1;
                        Q.offer(new loc(nx, ny));
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        c8_11 T = new c8_11();
        Scanner kb = new Scanner(System.in);
        maze = new int[8][8];
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                maze[i][j] = kb.nextInt();
            }
        }
        maze[1][1] = 1;
        loc root = new loc(1, 1);
        System.out.println(T.BFS(root));
    }
}
