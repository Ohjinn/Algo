package section7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class c7_14 {
    //최단거리 = BFS, 가는것의 갯수 = DFS
    static int n, m, answer = 0;
    static int[][] arr;
    static int[] ch;

    //레벨 숙제
    private int[] BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        int[] answer = new int[n + 1];
        int L = 0, cnt = 0;
        ch[1] = 1;
        Q.offer(v);
        while (cnt < n - 1) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int visit = Q.poll();
                answer[visit] = L;
                for (int j = 1; j <= n; j++) {
                    if (arr[visit][j] == 1 && ch[j] == 0) {
                        Q.offer(j);
                        ch[j] = 1;
                        cnt++;
                        if(cnt == n - 1) answer[j] = ++L;
                    }
                }
            }
            L++;
        }
        return answer;
    }



    public static void main(String[] args) {
        c7_14 T = new c7_14();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n + 1][n + 1];
        ch = new int[m];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            arr[a][b] = 1;
        }
        int[] answer = T.BFS(1);
        for(int i = 2; i <= n; i++) System.out.println(i + " : " + answer[i]);
    }
}
