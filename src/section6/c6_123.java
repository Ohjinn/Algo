package section6;

import java.util.Scanner;

public class c6_123 {
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
    //삽입
    private int[] solution1_3(int n, int[] arr){
        for(int i = 1; i < n; i++){
            int tmp = arr[i], j;
            for(j = i - 1; j >= 0; j--){
                if(arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        c6_123 T = new c6_123();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) arr[i] = kb.nextInt();
        arr = T.solution(a, arr);
        for (int i = 0; i < a; i++) System.out.print(arr[i] + " ");
    }
}
