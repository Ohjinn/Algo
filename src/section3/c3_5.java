package section3;

import java.util.Scanner;

public class c3_5 {
    private int solution(int n){
        int answer = 0, max = 0, p = 1;
        for(int i = 1; i <= (n / 2) + 1; i++){
            max += i;
            while(max > n){
                max -= p;
                p++;
            }
            if(max == n) answer++;
        }

        return answer;
    }

    private int solution5_1(int n){
        int answer = 0, sum = 0, lt = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) arr[i] = i + 1;
        for(int rt = 0; rt < m; rt++){
            sum += arr[rt];
            if(sum == n) answer++;
            while(sum >= n){
                sum -= arr[lt];
                if(sum==n) answer++;
            }
        }
        return answer;
    }

    private int solution5_2(int n){
        int answer = 0, cnt = 1;
        n--;
        while(n > 0){
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        c3_5 T = new c3_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
