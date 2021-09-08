package section8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int[][] maze;
    static int[][] ck;
    static int ways = 0;

    int[] a = {1, 0, -1, 0};
    int[] b = {0, 1, 0, -1};

    private void DFS(int c, int l) {
        if(c == 6 && l == 6) ways++;
        else{
            for(int i = 0; i < 4; i++){
                if((c + a[i] < 0) || (c + a[i] > 6) || (l + b[i] < 0) || (l + b[i] > 6)) break;
                if(maze[c + a[i]][l + b[i]] == 1) break;
                maze[c][l] = 1;
                DFS(c + a[i], l + b[i]);
                maze[c][l] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        maze = new int[7][7];
        ck = new int[7][7];
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                maze[i][j] = kb.nextInt();
            }
        }
        maze[0][0] = 1;
        T.DFS(0, 0);
        System.out.println(ways);
    }
}
