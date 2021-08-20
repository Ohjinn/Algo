package section5;

import java.util.Scanner;

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

    public static void main(String[] args) {
        c5_5 T = new c5_5();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.print(T.solution(a));
    }
}
