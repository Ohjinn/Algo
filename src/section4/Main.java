package section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private ArrayList solution(int n, int m, int[] arr){
        ArrayList answer = new ArrayList(n);
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(n + " " + m + " " + arr[6]);
        for(int i = 0; i < m - 1; i++) map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        for(int i = m; i < n - m; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            answer.add(map.size());
//            map.remove(arr[i - m]);
            //이렇게 하면 key를 그냥 삭제해버려서 counting이 정확하게 안된다.
            map.put(arr[i - m], map.get(arr[i - m]) - 1);
        }
        return answer;
    }

    private ArrayList<Integer> solution3_1(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i = 0; i < k - 1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for(int rt = k - 1; rt < n; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) - 1);
            if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution3_1(n, m, arr));
    }
}
