package section6;

import java.util.*;

public class c6_10 {

    public int count(int[] arr, int distance){
        int cnt = 1, last = arr[0];
        for(int x : arr){
            if(x - last >= distance && x != arr[0]){
                cnt++;
                last = x;
            }
        }
        return cnt;
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = arr[0];
        int rt = Arrays.stream(arr).max().getAsInt();
        while(lt <= rt){
            int mid = (lt + rt)/2;
            if(count(arr, mid) >= m){
                answer = mid;
                lt = mid + 1;
            }else rt = mid - 1;
        }
        return answer;
    }

    private int count1(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]-ep >= dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
    public int solution10_1(int n, int c, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= c){
                answer = mid;
                lt = mid + 1;
            }
            else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        c6_10 T = new c6_10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}