package section2;

import java.util.Scanner;

public class c2_7 {
    private int solution(int n, int[] numbers){
        int answer = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            if(numbers[i] == 1) {
                cnt++;
                answer += cnt;
            }
            else if(numbers[i] == 0){
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        c2_7 T = new c2_7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int numbers[] = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, numbers));
    }
}
