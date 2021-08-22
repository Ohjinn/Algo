package section5;

import java.util.*;

public class Main {

    private int solution(int n, int m){
        int answer = 0, count = 0;
        int[] arr = new int[n + 1];
        for(int i = 1; i <= n; i++) arr[i] = 1;
        for(int i = 1; i < n; i++) {
            count = 0;
            for(int j = i; count < m; j++){
                if(arr[j] != 0) count++;
                if(arr[j] == 0) j++;
                if(count == m) arr[j] = 0;
                j %= n;
            }
        }
        for(int i = 1; i < n; i++) if(arr[i] != 0) answer = i;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.print(T.solution(a, b));
    }
}