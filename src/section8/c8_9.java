package section8;

import java.util.Scanner;

public class c8_9 {
    static int[] combi;
    static int n, m;

    private void DFS(int L, int s) {
        if (L == m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        c8_9 T = new c8_9();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
