package section8;

import java.util.Scanner;

public class Main {
    static int n, limit = 0, max = 0;

    private void DFS(int L, int sum, int[] arr) {
        if(sum > limit) return;
        if (L == n) {
            if(sum > max) max = sum;
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        limit = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(max);
    }
}
