package section7;

import java.util.ArrayList;
import java.util.Scanner;

public class c7_13 {
    //배열을 이용한 탐색은 정점의 갯수가 많아지면 비효율적 그래서 ArrayList로 한다.
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        c7_13 T = new c7_13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++) graph.add(new ArrayList<Integer>());//각 ArrayList에 new를 해준다.
        ch = new int[n + 1];
        for(int i = 0; i < m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}
