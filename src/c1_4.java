import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Scanner;

//take the number of words and print out reversed words
public class c1_4 {
    private void solution(int n, String[] str){
        for(int i = 0; i < n; i++){
            String str2 = "";
            for(int j = str[i].length() - 1; j >= 0 ; j--){
                str2 = str2 + str[i].charAt(j);
            }
            System.out.println(str2);
        }
    }

    private ArrayList<String> solution4_1(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    private ArrayList<String> solution4_2(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        c1_4 T = new c1_4();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        String[] words = new String[number];

        for(int i = 0; i < number; i++){
            words[i] = kb.next();
        }
        T.solution(number, words);
    }
}
