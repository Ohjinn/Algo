package section8;

import java.util.Scanner;

public class c8_7 {
    int[][] dy = new int[35][35];

    private int DFS(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }


    public static void main(String[] args) {
        c8_7 T = new c8_7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n, r));
    }
}
