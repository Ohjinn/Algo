import java.util.*;
//Uppercase to Lowercase, Lowercase to Uppercase
public class c1_2 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(x >= 65 && x <= 90){
                x += 32;
            }
            else if(x >= 97 && x <= 122){
                x -= 32;
            }
            Character X = x;
            answer += X;
        }
        return answer;
    }

    public String solution2_2(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        c1_2 T = new c1_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}