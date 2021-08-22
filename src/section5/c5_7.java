package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class c5_7 {
    private String solution(String a, String b){
        String answer = "YES";
        int count = 0;
        Queue<Character> Q = new LinkedList<>();
        for(int i = 0; i < a.length(); i++) Q.offer(a.charAt(i));
        for(int i = 0; i < b.length(); i++){
            if(Q.peek() == b.charAt(i)) {
                count++;
                Q.poll();
            }
            if(Q.isEmpty()) break;
        }
        if(count != a.length()) return "NO";
        return answer;
    }

    private String solution7_1(String need, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x);
        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        c5_7 T = new c5_7();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
}
