package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class c5_6 {
    //실패.
    private int solution(int n, int m) {
        int answer = 0, count = 0;
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = 1;
        for (int i = 1; i < n; i++) {
            count = 0;
            for (int j = i; count < m; j++) {
                if (arr[j] != 0) count++;
                if (arr[j] == 0) j++;
                if (count == m) arr[j] = 0;
                j %= n;
            }
        }
        for (int i = 1; i < n; i++) if (arr[i] != 0) answer = i;
        return answer;
    }

    private int solution6_1(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i);
        while (!Q.isEmpty()) {
            for (int i = 1; i < k; i++) Q.offer(Q.poll());
            Q.poll();
            if (Q.size() == 1) answer = Q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        c5_6 T = new c5_6();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.print(T.solution(a, b));
    }

}
