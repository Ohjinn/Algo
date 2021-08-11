package section2;

import java.util.Scanner;
//가위바위보
public class c2_3 {

    private char[] solution(int numbers1[], int numbers2[], int n){
        char[] answer = new char[n];
        for(int i = 0; i < n; i++){
            if(numbers1[i] == numbers2[i]) answer[i] = 'D';
            else if((numbers1[i] == 1 && numbers2[i] == 2) || (numbers1[i] == 2 && numbers2[i] == 3)
                    || (numbers1[i] == 3 && numbers2[i] == 1)) answer[i] = 'B';
            else if((numbers1[i] == 1 && numbers2[i] == 3) || (numbers1[i] == 2 && numbers2[i] == 1)
                    || (numbers1[i] == 3 && numbers2[i] == 2)) answer[i] = 'A';
        }
        return answer;
    }

    public static void main(String[] args) {
        c2_3 T = new c2_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers1 = new int[n];
        int[] numbers2 = new int[n];
        for(int i = 0; i < n; i++) numbers1[i] = kb.nextInt();
        for(int i = 0; i < n; i++) numbers2[i] = kb.nextInt();
        for(char a : T.solution(numbers1, numbers2, n)){
            System.out.println(a);
        }
    }
}
