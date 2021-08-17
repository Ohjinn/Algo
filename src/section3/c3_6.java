package section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class c3_6 {

    private int solution(int[] a, int n, int m){
        int answer = 0, wildcard = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            int j = i;
            while(j < n){
                if(a[j] == 1) cnt++;
                else if(a[j] == 0 && wildcard < m){
                    cnt++;
                    wildcard++;
                }
                else break;
                j++;
                if(cnt > answer) answer = cnt;
            }
            cnt = 0;
            wildcard = 0;
        }
        return answer;
    }


    public static void main(String[] args) {
        c3_6 T = new c3_6();
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
