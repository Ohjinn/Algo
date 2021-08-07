import java.util.Scanner;

public class Main {

    public String solution(String str1, String str2){
        String answer = "";
        System.out.println(str1 + " " + str2);



        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.nextLine();
        String str2 = kb.nextLine();

        System.out.println(T.solution(str1, str2));
    }
}
