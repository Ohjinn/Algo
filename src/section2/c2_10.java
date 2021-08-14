package section2;

import java.util.Scanner;

public class c2_10 {
    private int solution(int n, int[][] numbers){
        int answer = 0;
        int ck = 4;
        int[] x = new int[]{1, 0, -1, 0};
        int[] y = new int[]{0, 1, 0, -1};
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                ck = 4;
                for(int k = 0; k < 4; k++){
                    if(numbers[i + x[k]][j + y[k]] < numbers[i][j]) ck--;
                }
                if(ck == 0) answer++;
            }
        }
        return answer;
    }

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    private int solution10_1(int n, int[][] arr){
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean flag = true;
                for(int k = 0; j < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        c2_10 T = new c2_10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int numbers[][] = new int[n+2][n+2];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                numbers[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, numbers));
    }
}
