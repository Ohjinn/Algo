package section3;

import java.util.Scanner;

public class c3_3 {
    private int solution(int[] a, int n, int m){
        int answer = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++) max += a[i];
        for(int i = m; i < n; i++){
            if(answer > max) max = answer;
            answer += a[i];
            answer -= a[i-m];

        }
        return max;
    }

    private int solution3_1(int n, int k, int[] arr){
        int answer, sum = 0;
        for(int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for(int i = k; i < n; i++){
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        c3_3 T = new c3_3();
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
