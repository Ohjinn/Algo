package section2;

import java.util.ArrayList;
import java.util.Scanner;
public class c2_12 {
    private int solution(int n, int m, int[][] numbers){
        int answer = 0, cnt = 0;
        int tmpx = 0, tmpy = 0;
        int[][] ck = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i != j) for(int k = 1; k <= m; k++){
                    for(int l = 1; l <= n; l++){
                        if(numbers[k][l] == i) tmpx = l;
                        if(numbers[k][l] == j) tmpy = l;
                    }
                    if(tmpx < tmpy) cnt++;
                }
                if(cnt == m) answer++;
            }
        }
        return answer;
    }

    private int solution12_1(int n, int m, int[][] arr){
        int answer = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        c2_12 T = new c2_12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int numbers[][] = new int[n+1][n+1];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                numbers[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution12_1(n, m, numbers));
    }
}