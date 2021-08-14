package section3;

import java.util.ArrayList;
import java.util.Scanner;

public class c3_1{

    private int[] solution(int[] a, int[] b){
        int full_length = a.length + b.length;
        int[] answer = new int[full_length];
        int ap = 0, bp = 0;
        for(int i = 0; i < full_length; i++){
            if (ap < a.length && a[ap] < b[bp]) {
                answer[i] = a[ap];
                ap++;
            }
            else{
                answer[i] = b[bp];
                bp++;
            }
        }
        return answer;
    }

    private ArrayList<Integer> solution3_1(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1<n && p2<m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        c3_1 T = new c3_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(a, b)) {
            System.out.print(x + " ");
        }
    }

}

