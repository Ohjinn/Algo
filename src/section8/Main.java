package section8;

import java.util.*;

class loca{
    int x, y;

    public loca(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[][] maze;
    int[] a = {1, 0, -1, 0};
    int[] b = {0, 1, 0, -1};

    private int BFS(loc root) {
        Queue<loc> Q = new LinkedList<>();

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        maze = new int[b][a];
        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= a; j++){
                maze[i][j] = kb.nextInt();
            }
        }
    }
}
