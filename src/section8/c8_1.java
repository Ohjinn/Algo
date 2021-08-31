package section8;

import java.util.Scanner;

public class c8_1 {
    static int n, total = 0;
    boolean flag = false;
    static String answer = "NO";

    private void DFS(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum > total / 2) return;
        if (L == n) {
            if((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    //    private void DFS1(int i){
//        if(sum == (max / 2)) {
//            answer = "YES";
//        }
//        else if(sum < max / 2){
//            for(int j = i; j < arr.length; j++){
//                sum += arr[i];
//                System.out.println(sum);
//                DFS(j);
//                sum -= arr[i];
//            }
//        }
//    }
    public static void main(String[] args) {
        c8_1 T = new c8_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
