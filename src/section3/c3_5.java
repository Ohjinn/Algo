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


    public static void main(String[] args) {
        c3_5 T = new c3_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
