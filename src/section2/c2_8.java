package section2;

import java.util.Scanner;

public class c2_8 {
    private int[] solution(int n, int[] numbers){
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i]++;
            for(int j = i + 1; j < n; j++){
                if(numbers[i] < numbers[j]) answer[i]++;
                else if(numbers[i] > numbers[j]) answer[j]++;
            }
        }
        return answer;
    }

    private int[] solution8_1(int n, int[] arr){
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        c2_8 T = new c2_8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int numbers[] = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = kb.nextInt();
        }
        for(int a : T.solution(n, numbers)){
            System.out.println(a + " ");
        }
    }
}
