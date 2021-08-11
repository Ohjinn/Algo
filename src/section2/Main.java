package section2;

import java.util.ArrayList;
import java.util.Scanner;
//prime number, same logic
public class Main {

    private int solution(int n){
        int[] answer = new int[200001];
        int cnt = 0;
        for(int i = 2; i <= n; i++){
            for(int j = 2; i * j <= n; j++){
                answer[i * j] = 1;
            }
            if(answer[i] == 0) cnt++;
        }
        return cnt;
    }

    private int solution5_1(int n){
        int answer = 0;
        int[] ch = new int[n + 1];
        for(int i = 2; i <= n; i++){
            if(ch[i] == 0){
                answer++;
                for(int j = i; j <= n; j = j + i){
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

}