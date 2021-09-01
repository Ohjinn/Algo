package section8;

import java.util.Scanner;

public class c8_4 {
    private void DFS(int L, int m, int[] arr, int[] mem) {
        if(L == m) {
            for(int i = 0; i < m; i++) System.out.print(mem[i] + " ");
            System.out.println();
            return;
        }
        else {
            for(int i = 0; i < arr.length; i++) {
                mem[L] = arr[i];
                DFS(L + 1, m, arr, mem);
            }
        }
    }

    static int[] pm;
    static int n, m;
    private void DFS(int L){
        if(L==m){
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else{
            for(int i = 1; i <= n; i++){
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        c8_4 T = new c8_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        int[] mem = new int[m];
        for(int i = 0; i < n; i++) arr[i] = i + 1;
        T.DFS(0, m, arr, mem);
    }
}
