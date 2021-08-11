package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class c2_1 {

    private void solution(int numbers[], int n){
        int tmp = 0;
        for(int i = 0; i < n; i++){
            if(numbers[i] > tmp) System.out.print(numbers[i] + " ");
            tmp = numbers[i];
        }
    }

    private ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]) ans.add(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        c2_1 T = new c2_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) numbers[i] = kb.nextInt();
        T.solution(numbers, n);
    }
}
