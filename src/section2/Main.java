package section2;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

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


    public static void main(String[] args) {
        Main T = new Main();
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