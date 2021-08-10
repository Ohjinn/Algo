import java.util.Scanner;
//print shortest distance with char input
public class c1_10 {

    private String solution(String str, char c){
        String answer = "";
        char[] s = str.toCharArray();
        for(char a : s){
            if(c == a){
                for(int i = 0; i < str.length()/2; i++){

                }
            }
        }

        return answer;
    }

    private int[] solution10_1(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }
            else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == t) p = 0;
            else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        c1_10 T = new c1_10();
        Scanner kb = new Scanner(System.in);
        String word = "";
        word = kb.next();
        String s = kb.next();
        char c = s.charAt(0);

        for(int x : T.solution10_1(word, c)){
            System.out.print(x + " ");
        }

//        System.out.println(T.solution10_1(word, c));
    }
}
