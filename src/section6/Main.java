package section6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    //버블
    private int[] solution(int a, int[] arr) {
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    //선택
    private int[] solution1_1(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) arr[i] = kb.nextInt();
        arr = T.solution(a, arr);
        for (int i = 0; i < a; i++) System.out.print(arr[i] + " ");
    }
}