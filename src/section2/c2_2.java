package section2;

import java.util.Scanner;
//
public class c2_2 {
    private int solution(int numbers[], int n){
        int tallest = 0, cnt = 0;

        for(int i = 0; i < n; i++){
            if(numbers[i] > tallest){
                cnt++;
                tallest = numbers[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        c2_2 T = new c2_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) numbers[i] = kb.nextInt();
        System.out.println(T.solution(numbers, n));
    }
}
