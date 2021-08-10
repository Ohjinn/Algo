import java.util.Scanner;

public class c1_11 {

    private String solution(String str){
        String answer = "";
        int ck = 1;
        char tmp = ' ';

        for(int i = 0; i < str.length()-1; i++){
            if(tmp == str.charAt(i)){
                ck++;
                if(str.charAt(i) != str.charAt(i + 1)){
                    System.out.print(str.charAt(i));
                    if(ck != 1) System.out.print(ck);
                    ck = 1;
                }
            }
            tmp = str.charAt(i);
        }
        return answer;
    }

    private String solution11_1(String s){
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i + 1)) cnt++;
            else{
                answer += s.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        c1_11 T = new c1_11();
        Scanner kb = new Scanner(System.in);
        String word = "";
        word = kb.next();


        T.solution11_1(word);
    }
}
