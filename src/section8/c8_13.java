package section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class loca {
    int x, y;

    public loca(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class c8_13 {


    static int[][] board, dis;
    int[] a = {1, 0, -1, 0};
    int[] b = {0, 1, 0, -1};
    static int n, m;
    static Queue<section8.loca> Q = new LinkedList<>();

    private void BFS() {
        while (!Q.isEmpty()) {
            section8.loca tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + a[i];
                int ny = tmp.y + b[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new section8.loca(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        c8_13 T = new c8_13();
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) Q.offer(new section8.loca(i, j));
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) flag = false;
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else System.out.println(-1);
    }
}


