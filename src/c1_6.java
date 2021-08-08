import java.util.Scanner;

public class c1_6 {

    private String solution(String str){
        String answer = "";
        char[] ck = new char[26];
        char[] s = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(ck[s[i] - 97] == 0){
                answer += (Character)s[i];
                ck[s[i]-97]++;
            }
        }
        return answer;
    }

    private String solution1_6(String str){
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i) answer+= str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        c1_6 T = new c1_6();
        Scanner kb = new Scanner(System.in);
        String word = "";
        word = kb.next();

        System.out.println(T.solution(word));
    }
}
