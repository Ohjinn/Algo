package section2;

import java.util.ArrayList;
import java.util.Scanner;
//if reversed number is prime number
public class c2_6 {
    private int[] solution(int n, int[] numbers){
        int[] answer = new int[n];
        int[] prime = new int[100001];
        int cnt = 0;

        for(int i = 2; i <= 100000; i++){
            for(int j = 2; i * j <= 100000; j++){
                prime[i * j] = 1;
            }
        }
        for(int i = 0; i < n; i++){
            int a = numbers[i];
            int tmp = 0;
            while(a > 0){
                tmp = tmp * 10;
                tmp = tmp + a % 10;
                a /= 10;
            }
            if(tmp >= 2 && prime[tmp] == 0) {
                answer[cnt] = tmp;
                cnt++;
            }
        }
        return answer;
    }

    public boolean isPrime(int num){
        if(num == 1) return false;
        for(int i = 2; i < num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    private ArrayList<Integer> solution6_1(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        c2_6 T = new c2_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int numbers[] = new int[n + 1];
        for(int i = 0; i < n; i++){
            numbers[i] = kb.nextInt();
        }
        int[] answer = T.solution(n, numbers);
        for(int a : answer) if(a != 0) System.out.print(a + " ");
    }
}
