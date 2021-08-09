import java.util.Scanner;
//find the longest word in the sentence
public class c1_3 {

    private String solution(String str1){
        String answer = "";

        String[] arr = str1.split(" ");
        for(String x : arr) {
            if(x.length() > answer.length()){
                answer = x;
            }
        }
        return answer;
    }

    private String solution3_1(String str1){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos = str1.indexOf(' '))!= -1){
            String tmp = str1.substring(0 , pos);
            int len = tmp.length();
            if(len>m){
                m = len;
                answer=tmp;
            }
            str1 = str1.substring(pos+1);
        }
        if(str1.length() > m) answer = str1;
        return answer;

    }

    public static void main(String[] args) {
        c1_3 T = new c1_3();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.nextLine();

        System.out.println(T.solution3_1(str1));
    }
}
