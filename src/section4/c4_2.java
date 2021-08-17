package section4;

import java.util.HashMap;
import java.util.Scanner;

public class c4_2 {
    private String solution(String a, String b){
        int max = 0;
        String answer = "YES";
        int[] count = new int[70];
        for(int i = 0; i < a.length(); i++) count[a.charAt(i) - 65]++;
        for(int i = 0; i < b.length(); i++) count[b.charAt(i) - 65]--;
        for(int i = 0; i < count.length; i++) if(count[i] != 0) return "NO";
        return answer;
    }

    private String solution2_1(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x)-1);
        }
        return answer;
    }


    public static void main(String[] args) {
        c4_2 T = new c4_2();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
}
