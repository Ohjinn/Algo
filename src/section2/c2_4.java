package section2;

import java.util.ArrayList;
import java.util.Scanner;
//fibonacci
public class c2_4 {

    private ArrayList<Integer> solution(int n){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(1);
        for(int i = 2; i < n; i++){
            answer.add((answer.get(i - 1) + answer.get(i - 2)));
        }
        return answer;
    }

    private void solution4_1(int n){
        int a = 1, b = 1, c;
        System.out.println(a + " " + b + " ");
        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }


    public static void main(String[] args) {
        c2_4 T = new c2_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i = 0; i < n; i++) System.out.print(T.solution(n).get(i) + " ");
    }
}
