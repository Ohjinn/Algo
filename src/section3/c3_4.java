package section3;

import java.util.Scanner;

public class c3_4 {

    private int solution(int[] a, int n, int m){
        int answer = 0, i = 0, max = 0, p = 0;
        while(max < m && i < n){
            max += a[i];
            if(max == m) answer++;
            while(max >= m){
                max -= a[p];
                p++;
                if(max == m) answer++;
            }
            i++;
        }
        return answer;
    }

    private int solution4_1(int n, int m, int[] arr){
        int answer = 0, sum = 0, lt = 0;
        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if(sum == m) answer++;
            while(sum >= m){
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        c3_4 T = new c3_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = kb.nextInt();
        }
        System.out.println(T.solution(a, n, m));
    }
}
