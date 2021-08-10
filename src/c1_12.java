import java.util.Scanner;

public class c1_12 {

    private String solution(String str, int n){
        String answer = "";
        for(int i = 0; i < n; i++){
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, '2');
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        c1_12 T = new c1_12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String word = kb.next();
        System.out.println(T.solution(word, n));
    }
}
