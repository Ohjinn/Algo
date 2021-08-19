package section5;

import java.util.*;

public class Main {

    private int solution(String str){
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if((x != '+') && (x != '-') && (x != '/') && (x != '*')) {
                stack.push((int)x - 48);
            }
            else if(x == '+') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b + a);
            }
            else if(x == '-') {
                int a = (int)stack.pop();
                int b = (int)stack.pop();
                stack.push(b - a);
            }
            else if(x == '*') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);
            }
            else if(x == '/') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.print(T.solution(a));
    }
}