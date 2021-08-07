import java.util.Scanner;

//take the number of words and print out reversed words
public class Main {
    private void solution(int n, String[] str){
        for(int i = 0; i < n; i++){
            String str2 = "";
            for(int j = str[i].length() - 1; j >= 0 ; j--){
                str2 = str2 + str[i].charAt(j);
            }
            System.out.println(str2);
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        String[] words = new String[number];

        for(int i = 0; i < number; i++){
            words[i] = kb.next();
        }
        T.solution(number, words);
    }
}
