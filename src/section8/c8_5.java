package section8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.exit;

public class c8_5 {
    static int n, n_coin = Integer.MAX_VALUE, change;
    static int m, answer = Integer.MAX_VALUE;
    /*
    DFS에서 L은 내림차순으로 정렬된 배열의 위치, coin은 현재 코인의 갯수,
    sum은 현재까지 거스름돈의 합, arr는 내림차순으로 정렬된 arr
    */
    private void DFS(int coin, int sum, Integer[] arr) {
        if (sum > change) return;//sum이 거슬러줄 돈을 넘으면 return
        else if (sum == change) {
            if(coin < n_coin) n_coin = coin;
        } else {
            for(int i = 0; i < arr.length; i++) {
                DFS(coin + 1, sum + arr[i], arr);
            }
        }
    }

    private void DFS1(int L, int sum, Integer[] arr){
        if(sum > m) return;
        if(L >= answer) return;
        if (sum == m) {
            if(sum==m){
                answer = Math.min(answer, L);
            }
        }else{
            for(int i = 0; i < n; i++){
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }


    public static void main(String[] args) {
        c8_5 T = new c8_5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        change = kb.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(n_coin);
    }
}
