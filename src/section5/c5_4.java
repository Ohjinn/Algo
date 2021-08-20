package section5;

import java.util.Scanner;
import java.util.Stack;

public class c5_4 {
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

    private int solution4_1(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) stack.push(x-48);
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt + rt);
                if(x == '-') stack.push(lt - rt);
                if(x == '*') stack.push(lt * rt);
                if(x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        c5_4 T = new c5_4();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.print(T.solution(a));
    }
}
