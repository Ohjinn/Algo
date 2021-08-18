package section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class c4_5 {
    /*\
        Tset.add(14); 14 추가
        Tset.remove(143); 143을 삭제
        Tset.size(); 키가 몇개 있느냐
        Tset.first(); 오름차순 - 최솟값, 내림차순 - 최댓값
        Tset.last(); --
     */


    private int solution(int n, int m, int[] arr){
        int answer = 0, max = 0, sum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        int lt = 0;
        for(int i = 0; i < n; i++){
            while(set.size() < 3) {
                set.add(arr[i]);
                sum += arr[i];
                i++;
                if(sum > answer) answer = sum;
            }
            //문제가 뭔소린지 모르겠다. 예시 답안이 152 아닌가?
        }
        return answer;
    }

    private int solution4_2(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int l = j + 1; l < n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt == k) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        c4_5 T = new c4_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution4_2(n, m, arr));
    }
}
