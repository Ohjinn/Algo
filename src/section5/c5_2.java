package section5;

import java.util.Scanner;
import java.util.Stack;

public class c5_2 {
    private String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else if(x == ')') stack.pop();
            else if(stack.empty()) answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        c5_2 T = new c5_2();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.print(T.solution(a));
    }
}
