import java.util.Scanner;

public class c1_9 {

    private int solution(String str){
        int answer = 0;
        str = str.replaceAll("[A-z]", "");
        answer = Integer.parseInt(str);
        return answer;
    }

    private int solution9_1(String s){
        int answer = 0;
        for(char x : s.toCharArray()){
            if(x>=48 && x <= 57) answer=answer*10+(x-48);
        }
        return answer;
    }

    private int solution9_2(String s){
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        c1_9 T = new c1_9();
        Scanner kb = new Scanner(System.in);
        String word = "";
        word = kb.nextLine();

        System.out.println(T.solution(word));
    }
}
