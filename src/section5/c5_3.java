package section5;

import java.util.Scanner;
import java.util.Stack;

public class c5_3 {
    private int solution(int n, int[][] arr, int m, int[] basket){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[j][basket[i]] != 0) {
                    if ((!stack.empty()) && (stack.peek() == arr[j][basket[i]])) {
                        stack.pop();
                        answer += 2;

                    } else {
                        stack.push(arr[j][basket[i]]);
                    }
                    arr[j][basket[i]] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        c5_3 T = new c5_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] basket = new int[m];
        for(int i = 0; i < m; i++) basket[i] = kb.nextInt();
        System.out.print(T.solution(n, arr, m, basket));
    }
}
