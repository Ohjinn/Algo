package section4;

import java.util.Scanner;

public class Main {
    private int solution(String hash, int n){
        int max = 0;
        char answer = 0;
        int[] count = new int[n];
        for(int i = 0; i < n; i++) count[hash.charAt(i) - 65]++;
        for(int i = 0; i < n; i++){
            if(count[i] > max) answer = (char)(count[i] + 65);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String hash = kb.next();
        System.out.print((char)T.solution(hash, n));
    }
}
