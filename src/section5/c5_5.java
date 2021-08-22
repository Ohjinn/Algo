package section5;

import java.util.Scanner;
import java.util.Stack;

public class c5_5 {
    private int solution(String str){
        int pipe = 0, answer = 0;
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length-1; i++){
            if((arr[i] == '(') && (arr[i + 1] == ')')) {
                answer += pipe;
                i++;
            }
            else if(arr[i] == '(') {
                answer++;
                pipe++;
            }
            else if(arr[i] == ')') pipe--;
        }
        return answer;
    }

    private int solution5_1(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        c5_5 T = new c5_5();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.print(T.solution(a));
    }
}
