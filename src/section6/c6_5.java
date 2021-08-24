package section6;

import java.util.Arrays;
import java.util.Scanner;

public class c6_5 {
    private char solution(int size, int[] arr) {
        char answer = 'U';
        int[] cache = new int[size];
        for(int x : arr){
            boolean ck = false;
            for(int i = 0; i < size; i++) if(x == cache[i]) ck = true;
            if(ck == false) {
                for(int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
            else {
                return 'D';
            }
        }
        return answer;
    }

    private String solution5_1(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i + 1]) return "D";
        }
        return answer;
    }

    public static void main(String[] args) {
        c6_5 T = new c6_5();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(a, arr));
    }
}
