package section5;

import java.util.Scanner;
import java.util.Stack;

public class c5_1 {
    private String solution(String a){
        String answer = "YES";
        int stack = 0;
        for(char s : a.toCharArray()){
            if(s == 40) stack++;
            else if(s == 41) stack--;
            if(stack < 0) return "NO";
        }
        if(stack != 0) return "NO";
        return answer;
    }

    private String solution1_1(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        c5_1 T = new c5_1();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.print(T.solution(a));
    }
}
