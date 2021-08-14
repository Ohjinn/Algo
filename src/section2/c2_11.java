package section2;

import java.util.Scanner;

public class c2_11 {
    //왜 오답이지, 다시할거
    private int solution(int n, int[][] numbers){
        int answer = 0, max = 0;
        int[][] ck = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if(i != k) if(numbers[k][j] == numbers[i][j]) {
                        ck[k][j] = 1;
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(ck[i][j] == 1) ck[i][0]++;
            }
        }
        for(int i = 1; i <= n; i++) if(ck[i][0] > max){
            max = ck[i][0];
            answer = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        c2_11 T = new c2_11();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int numbers[][] = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                numbers[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, numbers));
    }
}
