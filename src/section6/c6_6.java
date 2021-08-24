package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class c6_6 {
    private int solution(int size, int[] arr) {
        int answer1 = 0, answer2 = 0;
        boolean ck = true;
        for(int i = 0; i < size - 1; i++){
            if(arr[i] > arr[i + 1] && ck == true) {
                ck = false;
                answer1 = i;
            } if(arr[i] > arr[i + 1] && ck == false){
                answer2 = i + 2;
            }
        }
        System.out.print(++answer1 + " ");
        return answer2;
    }

    private ArrayList<Integer> solution6_1(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();//깊은 복사
        Arrays.sort(tmp);
        for(int i = 0; i < n; i++){
            if(arr[i] != tmp[i]) answer.add(i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        c6_6 T = new c6_6();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution6_1(a, arr));
    }
}
