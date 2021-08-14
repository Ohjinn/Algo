package section2;

import java.util.Scanner;

public class c2_9 {
    private int solution(int n, int[][] numbers){
        int answer = 0, row, col, hi = 0, x = 0, y = 0;
        for(int i = 0; i < n; i++){
            col = 0;
            row = 0;
            for(int j = 0; j < n; j++){
                col += numbers[i][j];
                row += numbers[j][i];
                if(col > row) hi = col;
                else hi = row;
            }
            if(hi > answer) answer = hi;
            x += numbers[i][i];
            y += numbers[i][n - i - 1];
        }
        if(x > y) if(x > answer) answer = x;
        else if(y > x) if(y > answer) answer = y;
        return answer;
    }

    private int solution9_1(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i = 0; i < n; i++){
            sum1 = sum2 = 0;
            for(int j = 0; j < n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args) {
        c2_9 T = new c2_9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int numbers[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                numbers[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, numbers));
    }
}
