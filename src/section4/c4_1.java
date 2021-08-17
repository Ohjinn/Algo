package section4;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashMap;
import java.util.Scanner;

public class c4_1 {
    private char solution(String hash, int n){
        int max = 0;
        char answer = 0;
        int[] count = new int[n];
        for(int i = 0; i < n; i++) count[hash.charAt(i) - 65]++;
        for(int i = 0; i < n; i++){
            if(count[i] > max) {
                max = count[i];
                answer = (char)(i + 65);
            }
        }
        return answer;
    }

    public char solution(int n, String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        //System.out.println(map.containsKey('A')); 이게 있으면 true 반환
//        System.out.println(map.size()); 키의 종류 갯수
//        System.out.println(map.remove('A')); A 제거
        int max = Integer.MIN_VALUE;
        for(char x : map.keySet()){
            if(map.get(x) > max){
                max = map.get(x);
                answer = x;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        c4_1 T = new c4_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String hash = kb.next();
        System.out.print(T.solution(hash, n));
    }
}
