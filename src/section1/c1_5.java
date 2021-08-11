package section1;

import java.util.Scanner;

//reverse only english
public class c1_5 {

    private String solution(String str){
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt < rt){
            if(!((s[lt] >= 65 && s[lt] <= 90) || (s[lt] >= 97) && (s[lt] <= 122))){
                lt++;
            }
            if(!((s[rt] >= 65 && s[rt] <= 90) || (s[rt] >= 97) && (s[rt] <= 122))){
                rt--;
            }
            if(((s[lt] >= 65 && s[lt] <= 90) || (s[lt] >= 97) && (s[lt] <= 122))
                    && ((s[rt] >= 65 && s[rt] <= 90) || (s[rt] >= 97) && (s[rt] <= 122))){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    private String solution5_1(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }


    public static void main(String[] args) {
        c1_5 T = new c1_5();
        Scanner kb = new Scanner(System.in);
        String word = "";
        word = kb.next();

        System.out.println(T.solution(word));
    }
}
