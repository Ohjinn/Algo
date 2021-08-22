package section5;

import java.util.*;

public class c5_8 {

    private int solution(int a, int b, int[] arr){
        int answer = 1, tmp = arr[b];
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 0; i < a; i++){
            if(i == b) i++;
            Q.offer(arr[i]);
        }
        for(int i = 0; i < a - 1; i++){
            if(Q.peek() > tmp) {
                answer++;
                Q.poll();
            }
            else if(Q.peek() == tmp && i < b) {
                answer++;
                Q.poll();
            }
            else Q.poll();
        }
        return answer;
    }

    class Person{
        int id;
        int priority;
        public Person(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution8_1(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Person> Q = new LinkedList<>();
        for(int i = 0; i < n; i++) Q.offer(new Person(i, arr[i]));
        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                if(tmp.id==m) return answer;
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        c5_8 T = new c5_8();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution8_1(a, b, arr));
    }
}