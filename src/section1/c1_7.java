package section1;

import java.util.Scanner;
//회문 문자열 'YES' or 'NO'
public class c1_7 {
    private String solution(String str){
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        boolean ck = true;
        while(lt < rt){
            if(!(Character.toLowerCase(s[lt]) == Character.toLowerCase(s[rt]))) ck = false;
            lt++;
            rt--;
        }
        if(ck) return "YES";
        else return "NO";
    }

    private String solution7_1(String str){
        String answer = "YES";
        str=str.toUpperCase();
        int len = str.length();
        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }

    //reverse로 String을 뒤집어서 비교
    private String solution7_2(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        c1_7 T = new c1_7();
        Scanner kb = new Scanner(System.in);
        String word = "";
        word = kb.next();

        System.out.println(T.solution(word));
    }
}
