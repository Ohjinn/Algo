package section8;

import javax.swing.*;
import java.util.Scanner;

public class c8_3 {
    static int n, t_max, total = 0;
    static int answer = Integer.MIN_VALUE, m;
    boolean flag = false;

    private void DFS(int L, int s_sum, int t_sum, int[] score, int[] time) {
        if(t_sum > t_max) return;
        if (L == n) {
            if(s_sum > total) total = s_sum;
        } else{
            DFS(L + 1, s_sum + score[L], t_sum + time[L], score, time);
            DFS(L + 1, s_sum, t_sum, score, time);
        }
    }

    private void DFS3_1(int L, int sum, int time, int[] ps, int[] pt){
        if(time > m) return;
        if(L == n) answer = Math.max(answer, sum);
        else{
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        c8_3 T = new c8_3();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        t_max = kb.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
            arr2[i] = kb.nextInt();
        }
        T.DFS(0, 0, 0, arr1, arr2);
        System.out.println(total);
    }
}
