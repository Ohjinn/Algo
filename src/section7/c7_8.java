package section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Find{
    int data;
    public Find(int data){
        this.data = data;
    }
}

public class c7_8 {
    Find root;
    public int BFS1(Find root, int b){
        Queue<Find> Q = new LinkedList<>();
        int[] ck = new int[10000];
        ck[root.data] = 1;
        Q.offer(root);
        int L = 0;
        while(Q.peek().data != b){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                Find cur = Q.poll();
                if(cur.data != b){
                    if(cur.data - 1 > 0 && ck[cur.data - 1] != 1) Q.offer(new Find(cur.data - 1));
                    ck[cur.data - 1] = 1;
                    if(cur.data > 0 && ck[cur.data + 1] != 1) Q.offer(new Find(cur.data + 1));
                    ck[cur.data + 1] = 1;
                    if(cur.data > 0 && ck[cur.data + 5] != 1) Q.offer(new Find(cur.data + 5));
                    ck[cur.data + 5] = 1;
                }
                else return L;
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        c7_8 T = new c7_8();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        T.root = new Find(a);
        System.out.println(T.BFS1(T.root, b));
    }
}
